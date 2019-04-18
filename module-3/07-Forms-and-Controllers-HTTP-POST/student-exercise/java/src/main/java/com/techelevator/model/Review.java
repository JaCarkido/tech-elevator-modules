package com.techelevator.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Review {
	private Long id;
	private String username;
	private int rating;
	private String title;
	private String text;
	private LocalDateTime dateSubmitted;
	private String formattedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getDateSubmitted() {
		return dateSubmitted;
		
	}
	public String getFormattedDate() {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM-dd-yyyy");
		formattedDate = getDateSubmitted().format(formatter);
		//formattedDate = formattedDate.replaceAll("-", "/");
		return formattedDate;
	}
	public void setDateSubmitted(LocalDateTime dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
}
