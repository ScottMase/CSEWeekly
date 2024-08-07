package com.tus.movie;

import java.util.Objects;

public class Movie {
	private String title;
	private String genre;
	private boolean onLoan;
	
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
		this.onLoan = false;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public boolean isOnLoan() {
		return onLoan;
	}

	public void setOnLoan(boolean onLoan) {
		this.onLoan = onLoan;
	}

}
