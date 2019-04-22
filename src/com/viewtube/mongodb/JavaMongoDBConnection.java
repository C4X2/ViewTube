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
import java.util.ArrayList;
import java.util.List;

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
		
		trythings();
	}
	
	public void trythings() {
		MongoCollection<Document> collection = mongodb.getCollection(MongoDBConnection.COLLECTION_NAME);
		Document document = new Document("name", "Nate").append("last", "brown");
		collection.insertOne(document);
		System.out.println(collection.countDocuments());
		
	}
}
