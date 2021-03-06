package com.viewtube.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.MongoCollection;


import org.bson.Document;
import java.util.Arrays;
import java.util.Iterator;

import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import com.viewtube.user.ViewTubeUser;
import com.viewtube.user.ViewTubeViewer;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a connection with a MongoDB database instance and interfaces with that database. Capable of read, write, update and delete operations.
 * @author C4X2
 *
 */
public class JavaMongoDBConnection implements MongoDBConnection {
	private MongoClient mgcl;
	private MongoDatabase mongodb;
	
	public JavaMongoDBConnection () {
		if (mgcl == null) {
			System.out.println("Creating connection to database cluster");
		    mgcl = MongoClients.create(MongoDBConnection.CONNECTION);
			System.out.println("Sucessfully connected to database cluster");
		}
		
		if (mongodb == null) {
			System.out.println("Connecting to database");
			mongodb = mgcl.getDatabase(MongoDBConnection.DATABASE_NAME);
			System.out.println("Sucessfully connected to database");
		}
		
	}
	
	/**
	 * A method to add a new ViewTubeUser to the MongoDB. Throws an exception if the user already exists in the database.
	 * @param vtvw a ViewTubeUser object.
	 * @return true, if ViewTubeUser was successfully added to the database, false if the user was not successfully added.
	 */
	public boolean addViewTubeUser(ViewTubeUser vtvw, String myCollection) throws DatabaseConflictException {
		//Try to find an instance of the user, to see if they already signed up for the service
		if(findViewTubeViewer(vtvw, myCollection) == null) { // If not findViewTubeViewer will return null
			// Create new Document and inserts it into the database
			MongoCollection<Document> collection = mongodb.getCollection(myCollection);
			collection.insertOne(new Document().append("_id", uniqueViewTubeID(vtvw))
					.append("username", vtvw.getUsername())
					.append("password", vtvw.getPassword()));
			return true;
		}
		// otherwise throw an exception because the individual is already signed up for the service
		throw new DatabaseConflictException();
	}
	
	/**
	 * A method to add new content to the ViewTube ecosystem. Content is either a comment or a video.
	 * @return
	 */
	public boolean addContent() {
		
		return true;
	}
	/**
	 * Finds the first instance of the matching id element for a ViewTubeViewer in the database.
	 * @param vtvw a ViewTubeViewer object, and user of the service.
	 * @param myCollection the name of the collection that you want to find the user in
	 * @return the document containing all the information about the specific ViewTubeViewer.
	 */
	public Document findViewTubeViewer(ViewTubeUser vtvw, String myCollection) {
		System.out.println("Entered addViewTubeViewer method");
		System.out.println("Accessing Viewer collection");
		MongoCollection<Document> collection = mongodb.getCollection(myCollection);
		System.out.println("Sucessfully accessed Viewer collection");
		System.out.println("Aggregating Documents from Viewer collection");
		FindIterable<Document> iterDoc = collection.find();
		System.out.println(iterDoc.first());
		System.out.println("Sucessfully aggregated Documents from Viewer collection");
		FindIterable<Document> iterDoc2=  iterDoc.filter(Filters.eq("_id", uniqueViewTubeID(vtvw)));
		System.out.println(iterDoc2.first());
		return iterDoc2.first();
	}
	
	/**
	 * Creates and returns a special ID string for each ViewTube Object.
	 * @param viewtubeObject an Object which is either derived of type ViewTubeUser, a comment, a CommentChain, PaymentInfo or a Video.
	 * @return a string representing the unique ID of the user
	 */
	public String uniqueViewTubeID(Object viewtubeObject) {
		if (viewtubeObject instanceof ViewTubeUser) {
			ViewTubeUser vtu = (ViewTubeUser) viewtubeObject;
			if (/*vtu.getId().isBlank() ||*/ vtu.getId() == null) {
				for (int i = 0; i < vtu.getUsername().length(); i++) {
					vtu.setId(vtu.getUsername().charAt(i) + "mog" + vtu.getUsername().charAt(vtu.getUsername().length() - i - 1) + i + vtu.getId());
				}
				for (int i = 0; i < vtu.getPassword().length(); i++) {
					vtu.setId("mog" + vtu.getPassword().charAt(vtu.getPassword().length() - i - 1) + i + vtu.getId());
				}
			}
			vtu.setId(vtu.getId().substring(0, vtu.getId().length() - 4));
			return vtu.getId();
		}
		return null;
	}
	
	/**
	 * Close the client, which will close all underlying cached resources, 
	 * including, for example,sockets and background monitoring threads. It is consider best practice to close a database connection once all operations on that database is complete.
	 */
	public void close() {
		mgcl.close();
	}
}
