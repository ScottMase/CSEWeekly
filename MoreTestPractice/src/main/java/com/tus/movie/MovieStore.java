package com.tus.movie;

import java.util.ArrayList;

public class MovieStore {
	private ArrayList<Movie> movieCollection;
	int numberOfMoviesRented;
	
	public MovieStore() {
		movieCollection = new ArrayList<Movie>();
		numberOfMoviesRented=0;
	}
	
	public int getNumOfMovieInStore() {
		return movieCollection.size();
	}
	
	public void addMovie(Movie movie) {
		movieCollection.add(movie);
	}
	
	public void removeMovie(Movie movie) {
		movieCollection.remove(movie);
	}
	
	public int getNumMoviesWithGenre(String genre) {
		int numWithGenre=0;
		for (Movie movie : movieCollection) {
			if (movie.getGenre().equals(genre)){
				numWithGenre++;
			};
		}
		return numWithGenre;
	}
	
	public String rentMovie(String movieTitle) {
		String result = "NOT FOUND";
		
		for (Movie movie : movieCollection) {
			if (movie.getTitle().equals(movieTitle)) {
				if (numberOfMoviesRented==2) {
					result="LIMIT EX";
				}
				else if (movie.isOnLoan()) {
					result = "ONLOAN";
				} else {
					movie.setOnLoan(true);
					result = "OK";
					numberOfMoviesRented++;
				}
			}
		}
		return result;
	}

}
