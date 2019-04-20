package com.viewtube.user;

import java.util.ArrayList;
import java.util.Collection;

import com.viewtube.content.*;

public class ViewTubeViewer extends ViewTubeUser {
	// 
	private ArrayList<Video> likedVideos;
	
	private ArrayList<Comment> comments;
	
	//List of user that this user has blocked
	private ArrayList<ViewTubeViewer> blocked;
	
	private ArrayList<ArrayList<Video>> likedPlaylists;
	
	// Array list of videos that the user has tagged
	private ArrayList<Video> taggedVideos;

	/**
	 * @return the likedVideos
	 */
	public ArrayList<Video> getLikedVideos() {
		return likedVideos;
	}

	/**
	 * @param likedVideos the likedVideos to set
	 */
	public void setLikedVideos(ArrayList<Video> likedVideos) {
		this.likedVideos = likedVideos;
		//Possibly need to change arraylist to collection because data will be in form of a json
		//TODO
	}

	/**
	 * @return the comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * @return the blocked
	 */
	public ArrayList<ViewTubeViewer> getBlocked() {
		return blocked;
	}

	/**
	 * @param blocked the blocked to set
	 */
	public void setBlocked(ArrayList<ViewTubeViewer> blocked) {
		this.blocked = blocked;
	}

	/**
	 * @return the likedPlaylists
	 */
	public ArrayList<ArrayList<Video>> getLikedPlaylists() {
		return likedPlaylists;
	}

	/**
	 * @param likedPlaylists the likedPlaylists to set
	 */
	public void setLikedPlaylists(ArrayList<ArrayList<Video>> likedPlaylists) {
		this.likedPlaylists = likedPlaylists;
	}

	/**
	 * @return the taggedVideos
	 */
	public ArrayList<Video> getTaggedVideos() {
		return taggedVideos;
	}

	/**
	 * @param taggedVideos the taggedVideos to set
	 */
	public void setTaggedVideos(ArrayList<Video> taggedVideos) {
		this.taggedVideos = taggedVideos;
	}
}
