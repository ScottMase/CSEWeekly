package com.tus.songlibrary;

public class Song {
	
	private String artist;
	private int duration;
	private String title;
	
	public Song(String artist, String title, int duration) {
		this.artist = artist;
		this.title = title;
		this.duration = duration;
	}

	public String getArtist() {
		return artist;
	}

	public int getDuration() {
		return duration;
	}

	public String getTitle() {
		return title;
	}
	
	

}
