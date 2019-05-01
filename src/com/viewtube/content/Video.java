package com.viewtube.content;

import java.awt.Image;

public class Video {
	private Image thumbnail;
	private long length;

	/**
	 * @return the length of the video
	 */
	public long getLength() {
		return length;
	}

	/**
	 * @param length set the length of the video
	 */
	public void setLength(long length) {
		this.length = length;
	}

	/**
	 * @return the thumbnail
	 */
	public Image getThumbnail() {
		return thumbnail;
	}

	/**
	 * @param thumbnail the thumbnail to set
	 */
	public void setThumbnail(Image thumbnail) {
		this.thumbnail = thumbnail;
	}
}
