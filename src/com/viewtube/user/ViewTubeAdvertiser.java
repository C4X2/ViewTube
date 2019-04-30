package com.viewtube.user;

import java.util.ArrayList;

import com.viewtube.content.Video;

public class ViewTubeAdvertiser extends ViewTubeUser {
	/**
	 * A parameter to determine whether or not an advertiser has been personally verified by ViewTube
	 */
	private boolean isVerified;
	
	private ArrayList<Video> uploadedVideos;
	
	private ArrayList<ViewTubeViewer> blocked;

	/**
	 * @return the isVerified
	 */
	public boolean isVerified() {
		return isVerified;
	}

	/**
	 * @param isVerified the isVerified to set
	 */
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	/**
	 * @return the uploadedVideos
	 */
	public ArrayList<Video> getUploadedVideos() {
		return uploadedVideos;
	}

	/**
	 * @param uploadedVideos the uploadedVideos to set
	 */
	public void setUploadedVideos(ArrayList<Video> uploadedVideos) {
		this.uploadedVideos = uploadedVideos;
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
	
	
}
