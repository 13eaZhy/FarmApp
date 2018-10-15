package main;

import animals.Cow;

public class FarmApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("COW BEFORE");
		Cow.info();
			while ( Cow.eat(600) );
		Cow.eat(50);
		System.out.println("COW AFTER");
		Cow.info();
		Cow.walk(50);

	}

}
