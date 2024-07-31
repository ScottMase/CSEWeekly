package com.ait.catpound;

import java.util.ArrayList;
import java.util.List;

public class CatPound {
  private ArrayList<Cat> cats;

  public CatPound() {
      this.cats = new ArrayList<>();
  }
  
  public int getNumberOfCats() {
     return cats.size();
  }
  
	public String addCat(Cat cat) {
		if (cat.getName().isEmpty()) {
          return "NAME EMPTY";
       }
		for (Cat catInPound :cats) {
        	if (catInPound.getName().equals(cat.getName())) {
        		return "CAT ALREADY IN POUND";
        	}
        }
		cats.add(cat);
		return "CAT ADDED";
	}
	
	public String removeCat(String cat) {
		boolean found = false;
		for (Cat c: cats) {
			  if (c.getName().equals(cat)) {
				  cats.remove(c);
				  found = true;
			  }
			}
		if (found) {
			return "CAT REMOVED";
					
		}
		else {
			return "CAT NOT FOUND";
		}
	}

}
