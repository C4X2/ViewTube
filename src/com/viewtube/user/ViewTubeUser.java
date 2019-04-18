package com.viewtube.user;

import java.awt.Image;


public class ViewTubeUser {
	
	// A user's login in information
	private String username;
	private String password;
	
	//Name to be displayed on the site
	private String name;
	// Immutable id that tracks the user through the entirety of the system
	private String id;
	
	// Personalized icon
	private Image icon;
	
	public ViewTubeUser() { }
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Image getIcon () {
		return this.icon;
	}
	
	public void setIcon(Image icon) {
		this.icon = icon;
	}
}
