package com.viewtube.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
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
		   mgcl = MongoClients.create(MongoDBConnection.CONNECTION);
		}
		
		if (mongodb == null) {
			mongodb = mgcl.getDatabase(MongoDBConnection.DATABASE_NAME);
		}
		
	}
	
	/**
	 * A method to add a new ViewTubeViewer to the MongoDB. Throws an exception if the user already exists in the database.
	 * @param vtvw a ViewTubeViewer object.
	 * @return true, if ViewTubeViewer was successfully added to the database, false if the user was not successfully added.
	 */
	public boolean addViewTubeViewer(ViewTubeViewer vtvw) throws DatabaseConflictException {
		MongoCollection<Document> collection = mongodb.getCollection(MongoDBConnection.COLLECTION_VIEWER);
		collection.
	}
	
	public void trythings() {
		MongoCollection<Document> collection = mongodb.getCollection(MongoDBConnection.COLLECTION_NAME);
		Document document = new Document("name", "Nate").append("last", "brown");
		collection.insertOne(document);
		System.out.println(collection.countDocuments());
		
	}
}
