package com.ait.catpound;

public class Testing {

	public static void main(String[] args) {
		CatPound cp = new CatPound();
		Cat c = new Cat("Whisker", 2);

		cp.addCat(c);
		
		cp.removeCat("Whisker");
	}

}
