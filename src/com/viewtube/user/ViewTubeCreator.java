package com.viewtube.user;

import java.util.ArrayList;
import com.viewtube.content.*;

public class ViewTubeCreator extends ViewTubeViewer {
	private ArrayList<Video> uploadedVideos;
	
	private boolean isVerified;

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
}
