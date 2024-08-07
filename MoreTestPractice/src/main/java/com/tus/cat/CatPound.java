package com.tus.cat;

import java.util.ArrayList;

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

    public String removeCat(String name) {
    	for (Cat catInPound :cats) {
        	if (catInPound.getName().equals(name)) {
        		cats.remove(catInPound);
        		return "CAT REMOVED";
        	}
        }
        return "CAT NOT IN POUND";
    }

    public boolean isCatInPound(String name){
		boolean catFound=false;
		for (Cat cat :cats){
			if (cat.getName().equals(name)){
				catFound=true;
			}
		}
		return catFound;
	}
	public int getNumberOfCatsOlderThan(int age){
		int numberOlder=0;
		for (Cat cat :cats){
			if (cat.getAge()>age){
				numberOlder++;
			}
		}
		return numberOlder;
	}
}
