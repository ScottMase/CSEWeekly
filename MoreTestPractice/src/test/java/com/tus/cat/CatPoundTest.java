package com.tus.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatPoundTest {
    private CatPound catPound;
    private Cat cat1;
    private Cat cat2;
    private Cat cat3;

    @BeforeEach
    public void setUp() {
        catPound = new CatPound();
        cat1 = new Cat("Whiskers", 2);
        cat2 = new Cat("Felix", 4);
        cat3 = new Cat("Garfield", 6);
    }

    // User Story 1
    @Test
    public void testNoCatsInPound() {
        assertEquals(0, catPound.getNumberOfCats());
    }
    
  // User Story 2
  @Test
  public void testAddCatToPound() {
      assertEquals("CAT ADDED", catPound.addCat(cat1));
      assertEquals(1, catPound.getNumberOfCats());
  }
  
	@Test
	public void testAddCatNameEmpty() {
		Cat cat4 = new Cat("", 2);
		assertEquals("NAME EMPTY", catPound.addCat(cat4));
		assertEquals(0, catPound.getNumberOfCats());
	}
	
	@Test
  public void testAddCatalreadyInPound() {
      assertEquals("CAT ADDED", catPound.addCat(cat1));
      assertEquals(1, catPound.getNumberOfCats());
      assertEquals("CAT ALREADY IN POUND", catPound.addCat(cat1));
      assertEquals(1, catPound.getNumberOfCats());
  }

    // User Story 3
    @Test
    public void testRemoveCatFromPoundSuccess() {
        catPound.addCat(cat1);
        assertEquals("CAT REMOVED", catPound.removeCat("Whiskers"));
        assertEquals(0, catPound.getNumberOfCats());
    }
    @Test
    public void testRemoveCatFromPoundNotFound() {
        catPound.addCat(cat1);
        assertEquals("CAT NOT IN POUND", catPound.removeCat("Felix"));
        assertEquals(1, catPound.getNumberOfCats());
    }
      
//    // User Story 4
    @Test
    public void testFindCatInPound() {
        catPound.addCat(cat1);
        assertTrue(catPound.isCatInPound("Whiskers"));
    }
    
    @Test
    public void testFindCatNotInPound() {
        catPound.addCat(cat1);
        assertFalse(catPound.isCatInPound("Felix"));
    }

    // User Story 5
    @Test
    public void testGetNumberOfCatsOlderThan() {
        catPound.addCat(cat1);
        catPound.addCat(cat2);
        catPound.addCat(cat3);
        assertEquals(1, catPound.getNumberOfCatsOlderThan(5));
        assertEquals(2, catPound.getNumberOfCatsOlderThan(3));
    }
}
