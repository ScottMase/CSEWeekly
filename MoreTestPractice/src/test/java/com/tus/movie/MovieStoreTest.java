package com.tus.movie;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovieStoreTest {

	private MovieStore myMovieStore;

	@BeforeEach
	public void setUp() {
		myMovieStore = new MovieStore();
	}

	@Test   //Test 1-1
	void testNoMoviesInStore() {
		assertEquals(0, myMovieStore.getNumOfMovieInStore());
	}
	
	@Test   //Test 2-1
	void testOneMovieInStore() {
		Movie movie=new Movie("Toy Story 3", "family");
		myMovieStore.addMovie(movie);
		assertEquals(1, myMovieStore.getNumOfMovieInStore());
	}
	
	@Test    //Test2-2
	void testTwoMoviesInStore() {
		Movie movie=new Movie("Toy Story 3", "family");
		Movie movieTwo=new Movie("Toy Story 2", "family");
		myMovieStore.addMovie(movie);
		myMovieStore.addMovie(movieTwo);
		assertEquals(2, myMovieStore.getNumOfMovieInStore());
	}
	
	@Test  //Test 3-2
	void testRemoveMovieFromStore() {
		Movie movie=new Movie("Toy Story 3", "family");
		Movie movieTwo=new Movie("Toy Story 2", "family");
		myMovieStore.addMovie(movie);
		myMovieStore.addMovie(movieTwo);
		assertEquals(2, myMovieStore.getNumOfMovieInStore());
		myMovieStore.removeMovie(movieTwo);
		assertEquals(1, myMovieStore.getNumOfMovieInStore());
	}
	
	@Test  //Test 4-1
	void testNumMoviesWithGenre() {
		Movie movie=new Movie("Toy Story 3", "drama");
		Movie movieTwo=new Movie("Toy Story 2", "drama");
		Movie movieThree=new Movie("Top Gun", "action");
		myMovieStore.addMovie(movie);
		myMovieStore.addMovie(movieTwo);
		myMovieStore.addMovie(movieThree);
		assertEquals(2, myMovieStore.getNumMoviesWithGenre("drama"));
		
	}
	
	@Test  //Test 5-1
	void testRentMovieOK() {
		Movie movie=new Movie("Toy Story 3", "drama");
		myMovieStore.addMovie(movie);
		assertEquals("OK", myMovieStore.rentMovie("Toy Story 3"));
		assertTrue(movie.isOnLoan());
		
	}
	
	@Test  //Test 5-2
	void testRentMovieAlreadyRented() {
		Movie movie=new Movie("Toy Story 3", "drama");
		myMovieStore.addMovie(movie);
		assertEquals("OK", myMovieStore.rentMovie("Toy Story 3"));
		assertEquals("ONLOAN", myMovieStore.rentMovie("Toy Story 3"));
		
	}
	
	@Test // Test 5-3
	void testRentMovieNotInStore() {
		Movie movie = new Movie("Toy Story 3", "drama");
		myMovieStore.addMovie(movie);
		assertEquals("OK", myMovieStore.rentMovie("Toy Story 3"));
		assertEquals("NOT FOUND", myMovieStore.rentMovie("Toy Story 2"));
	}
	
	@Test // Test 5-4
	void testRentalLimitExceeded() {
		Movie movie = new Movie("Toy Story 3", "family");
		Movie movieTwo=new Movie("Toy Story 2", "family");
		Movie movieThree=new Movie("Harry Potter", "family");
		myMovieStore.addMovie(movie);
		myMovieStore.addMovie(movieTwo);
		myMovieStore.addMovie(movieThree);
		assertEquals("OK", myMovieStore.rentMovie("Toy Story 3"));
		assertEquals("OK", myMovieStore.rentMovie("Toy Story 2"));
		assertEquals("LIMIT EX", myMovieStore.rentMovie("Harry Potter"));
	}
}
