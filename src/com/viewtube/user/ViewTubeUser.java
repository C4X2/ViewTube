package com.viewtube.user;

import com.viewtube.content.*;

import java.awt.Image;
import java.time.Instant;


public abstract class ViewTubeUser {
	
	// A user's login in information
	private String username;
	private String password;
	
	//Name to be displayed on the site
	private String name;
	// Immutable id that tracks the user through the entirety of the system
	private String id;
	
	// Personalized icon
	private Image icon;
	
	//User email
	private String email;
	
	//The language in which the user speaker/reads
	private String language;
	
	//The user credit card information
	private PaymentInfo pmnt;
	
	//Date the user first signed up for ViewTube
	private long date;
	
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
	
	public String getEmail () {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLangauge() {
		return this.language;
	}
	
	public void setLangauge(String lang) {
		this.language = lang;
	}
	
	public void setPmnt(PaymentInfo info) {
		this.pmnt = info;
	}
	
	public PaymentInfo getPmnt() {
		return this.pmnt;
	}
	
	public void setDate (Long date) {
		long temp = Instant.now().getEpochSecond();
		if (temp - date > 10000) {
			this.date = temp;
		}
		else {
			this. date = date;
		}
	}
	
	public Long getDate() {
		return this.date;
	}
}
