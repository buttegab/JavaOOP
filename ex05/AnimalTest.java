// package com.tutorialspoint;
import java.lang.*;

class Animal {
	private int size;
	private String name;

	void makeNoise() {
		System.out.println("quex");
	}

	public int getSize() {
		//Returns size of 'this' Animal object
		return size;
	}

	public void setSize(int s) {
		//Sets size of 'this' Animal object
		size = s;
	}

	public String getName() {
		//Returns name of 'this' Animal object
		return name;
	}

	public void setName(String n) {
		//Sets name of 'this' Animal object
		name = n;
	}


	public boolean isBigger(Animal a){
		//a: Animal object
		//Compares 'this' Animal with parameter Animal object and returns true if 'this' is bigger or false otherwise
		if (a.getSize() > size) {
			return false;
		}
		else {
			return true;
		}
	}
}



class Dog extends Animal{

	void makeNoise() {
		//Makes system print string emulating a bark
		System.out.println("Ruff! Ruff!");
	}
}

class Cat extends Animal {
	
	void makeNoise() {
		//Makes system print string emulating a meow
		System.out.println("Mow! Mow!");
	}
}

class AnimalPack {
	private Animal[] animals;
	Dog dog;
	Cat cat;

	public void makeArray(int s) {
		//Takes an integer size for an array and makes a Animal object array of that size
		animals = new Animal[s];
	}

	public void addAnimal(int ind, int animNum) {
		//ind: index of array to add the Dog object to
		//animNum: Dog object to be added to the array if animNum = 0, else add Cat object
		// Takes an index and a random number of 0 or 1 and replaces whatever is at that index with the appropriate Animal object
		if (ind >= animals.length || animals.length < 1) {
			System.out.println("Index outside declared range or array not initialized!");
		}
	
		else {
			if (animNum == 0) {
				Dog dog = new Dog();
				dog.setSize((int)Math.random()*4+20);
				dog.setName("barker");
				animals[ind] = dog;
			}
	
			else {
				Cat cat = new Cat();
				cat.setSize((int)Math.round(Math.random()*1+10));
				cat.setName("catsy");
				animals[ind] = cat;
			}
		}
	}

	public Animal biggestAnimal(){
		//Returns the biggest dog in the DogPack object
		Animal biggerAnimal = new Animal();
		biggerAnimal.setSize(0);
		for (int i = 0; i<animals.length; i = i + 1){
			if (animals[i].isBigger(biggerAnimal)){
				biggerAnimal = animals[i];
			}
		}
		return biggerAnimal;
	}

	public void makeNoise(){
		for (int i = 0; i<animals.length; i = i + 1) {
			animals[i].makeNoise();
		}
	}
}


class AnimalTest {

	
	public static void main (String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.makeNoise();
		cat.makeNoise();
		
		dog.setName("barksy");
		cat.setName("Mowser");

		dog.setSize(4);
		cat.setSize(2);

		System.out.println(dog.getSize());
		System.out.println(cat.getSize());

		System.out.println(dog.getName());
		System.out.println(cat.getName());

		System.out.println(dog.isBigger(cat));
		
		AnimalPack animalPack = new AnimalPack();
		animalPack.makeArray(5);
		for (int i = 0; i<5; i = i + 1){
			animalPack.addAnimal(i,(int)Math.round(Math.random()));
		}
		animalPack.makeNoise();
		System.out.println(animalPack.biggestAnimal().getName());
		System.out.println(animalPack.biggestAnimal().getSize());
	}
}