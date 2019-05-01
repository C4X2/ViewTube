package com.viewtube.content;

import com.viewtube.user.ViewTubeUser;

public class Comment {
	private String text;
	private ViewTubeUser commenter;
	private int likes;
	private long dateCommented;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the commenter
	 */
	public ViewTubeUser getCommenter() {
		return commenter;
	}

	/**
	 * @param commenter the commenter to set
	 */
	public void setCommenter(ViewTubeUser commenter) {
		this.commenter = commenter;
	}

	/**
	 * @return the likes
	 */
	public int getLikes() {
		return likes;
	}

	/**
	 * @param likes the likes to set
	 */
	public void setLikes(int likes) {
		this.likes = likes;
	}

	/**
	 * @return the dateCommented
	 */
	public long getDateCommented() {
		return dateCommented;
	}

	/**
	 * @param dateCommented the dateCommented to set
	 */
	public void setDateCommented(long dateCommented) {
		this.dateCommented = dateCommented;
	}
	
}
