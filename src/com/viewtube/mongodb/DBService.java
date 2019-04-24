package com.viewtube.mongodb;

import com.viewtube.user.ViewTubeUser;
import com.viewtube.user.ViewTubeViewer;
import com.viewtube.content.*;

/**
 * A dedicated service to connecting to a MongoBD instance. 
 * This class interacts with the JavaMongoDBConnection which actually interfaces with the database.
 * 
 * @version 1.0
 * @author C4X2
 * 
 */
public class DBService {
	
	private static JavaMongoDBConnection jmdbc;
	
	/**
	 * Adds a viewTubeObject to the appropriate collection present in the MongoDB database.
	 * @param viewtubeObject
	 */
	public static void create(Object viewtubeObject ) {
		System.out.println("Entering create method in DBService class");
		createhelper(viewtubeObject);
	}
	private static void createhelper(Object viewtubeObject) {
		System.out.println("Entering submethod in DBService class");
		System.out.println("Establishing connection to JavaMongoDBConnection class");
		jmdbc = new JavaMongoDBConnection();
		System.out.println("Sucessfully connected to JavaMongoDBConnection class");
		
		System.out.println("Comparing obejct to known classes");
		if (viewtubeObject instanceof ViewTubeUser) {
			System.out.println("known ViewTubeViewer correctly identified");
			try {
				System.out.println("Attempting to add user to the database");
				jmdbc.addViewTubeViewer((ViewTubeViewer)viewtubeObject);
			} catch (DatabaseConflictException e) {
				// TODO Auto-generated catch block
				System.out.println("Erorr Error Error");
				e.printStackTrace();
			}
		}
		else if (viewtubeObject instanceof Video) {
			
		}
		else if (viewtubeObject instanceof PaymentInfo) {
			
		}
		else if (viewtubeObject instanceof Comment) {
			
		}
		else if (viewtubeObject instanceof CommentChain) {
			
		}
		else {
			//TODO This means that the passed object is not a relevant type to save in our database so we can ignore it
		}
		jmdbc.close();
	}
	/**
	 * Saves the new attributes of the object to the database. Updates the appropriate fields
	 * @param viewtubeObject
	 */
	public static void save(Object viewtubeObject) {
		savehelper(viewtubeObject);
	}

	private static void savehelper(Object viewtubeObject) {

		
	}
	
	/**
	 * Deletes specified item in database. If item is not found in the database then it returns false, if the item cannot be deleted an exception is thrown.
	 * @param viewtubeObject an Object which is either derived of type ViewTubeUser, a comment, a CommentChain, PaymentInfo or a Video.
	 */
	public static void delete(Object viewtubeObject) {
		
	}
	
	/**
	 * Retrieves from the database the specified item. If the item is not found in the database the case fails silently.
	 * @param viewtubeObject an Object which is either derived of type ViewTubeUser, a comment, a CommentChain, PaymentInfo or a Video.
	 */
	public static void get(Object viewtubeObject) {
		
	}
	
	/**
	 * Overwrites the old object with the new object in the database. Importantly the unique ViewTubeID persists across objects.
	 * @param oldObject an Object which is either derived of type ViewTubeUser, a comment, a CommentChain, PaymentInfo or a Video. The old entry into the database.
	 * @param newObject an Object which is either derived of type ViewTubeUser, a comment, a CommentChain, PaymentInfo or a Video. The new entry into the database.
	 */
	public static void overwrite(Object oldObject, Object newObject) {
		
	}

}
