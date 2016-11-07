import java.util.ArrayList;
class DogPack {

	private ArrayList<Dog> dogs;

	public void makeArray(int s) {

		//Takes an integer size for an array and makes a Dog object array of that size
		dogs = new ArrayList<Dog>(s);
	}

	public void addDog(int ind, Dog dog) {
		//ind: index of array to add the Dog object to
		//dog: Dog object to be added to the arrayList
		// Takes an index and Dog object and inserts a dog object at that index
		dogs.add(ind, dog);
	}
	public Dog biggestDog(){
		//Returns the biggest dog in the DogPack object
		Dog biggerDog = new Dog();
		biggerDog.setSize(0);
		for (int i = 0; i<dogs.size(); i = i + 1){
			if (dogs.get(i).isBigger(biggerDog)){
				biggerDog = dogs.get(i);
			}
		}
		return biggerDog;
	}
}


class Dog {

	private int size;
	String breed;
	String name;

	void bark() {
		//Makes system print string emulating a bark
		System.out.println("Ruff! Ruff!");
	}

	public int getSize() {
		//Returns size of 'this' Dog object
		return size;
	}

	public void setSize(int s) {
		//Sets size of 'this' Dog object
		size = s;
	}

	public boolean isBigger(Dog d){
		//d: Dog object
		//Compares 'this' Dog with parameter Dog object and returns true if 'this' is bigger or false otherwise
		if (d.getSize() > size) {
			return false;
		}
		else {
			return true;
		}
	}
}

class Cat extends Dog {
	
	void bark() {
		//Makes the system print a cat customized string
		System.out.println("I am a cat");
	}	
}

class DogTestDrive {
	public static void main (String[] args) {
		//Tests the relevant code within Dog and DogPack
		int[] sizes;

		sizes = new int[3];
		for (int i = 0; i<sizes.length; i = i + 1){
			sizes[i] = i + 2;
		}

		DogPack dogpack = new DogPack();
		dogpack.makeArray(sizes.length);
		for (int i = 0; i<sizes.length; i = i + 1){
			Dog newDog = new Dog();
			newDog.setSize(sizes[i]);
			dogpack.addDog(i, newDog);
		}
		System.out.println(dogpack.biggestDog().getSize());

		Dog[] pets;
		pets = new Dog[3];
		for (int i = 0; i<pets.length; i = i + 1){
			pets[i] = new Dog();
		}
		pets[0].name = "a";
		pets[1].name = "b";
		pets[2].name = "c";

		pets[0].breed = "mutt";
		pets[1].breed = "poodle";
		pets[2].breed = "retriever";

		pets[0].setSize(1);
		pets[1].setSize(7);
		pets[2].setSize(5);

		for (int i = 0; i<pets.length; i = i + 1){
			pets[i].bark();
		}

		Dog bigDog = pets[0];
		for (int i = 0; i<pets.length; i = i + 1){
			if (pets[i].isBigger(bigDog)) {
				bigDog = pets[i];
			}
		}
		
		System.out.println(bigDog.name);
		System.out.println(bigDog.breed);
		System.out.println(bigDog.getSize());
	}
}