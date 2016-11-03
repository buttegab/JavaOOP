class Dog {

	private int size;
	String breed;
	String name;

	void bark() {
		System.out.println("Ruff! Ruff!");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		size = s;
	}

	public boolean isBigger(Dog d){
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
		System.out.println("I am a cat");
	}	
}

class DogTestDrive {
	public static void main (String[] args) {
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
			// if (bigDog.getSize() < pets[i].getSize()){
			if (pets[i].isBigger(bigDog)) {
				bigDog = pets[i];
			}
		}
		
		System.out.println(bigDog.name);
		System.out.println(bigDog.breed);
		System.out.println(bigDog.getSize());
	}
}