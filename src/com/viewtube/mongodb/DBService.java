package com.viewtube.mongodb;

import com.viewtube.user.ViewTubeUser;
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
	
	private JavaMongoDBConnection jmdbc;
	
	/**
	 * 
	 */
	public static void create(Object viewtubeObject ) {
		createhelper(viewtubeObject);
	}
	private static void createhelper(Object viewtubeObject) {
		if (viewtubeObject instanceof ViewTubeUser) {
			
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
			//TODO This means that the passed obejct is not a relevant type to save in our database so we can ignore it
		}
		
	}
	/**
	 * Saves the new attributes of the object to the datbase
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
