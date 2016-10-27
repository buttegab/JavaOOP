class Dog {
	
	int size;
	String breed;
	String name;

	void bark() {
		System.out.println("Ruff! Ruff!");
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

		pets[0].size = 1;
		pets[1].size = 7;
		pets[2].size = 5;

		for (int i = 0; i<pets.length; i = i + 1){
			pets[i].bark();
		}

		Dog bigDog = pets[0];
		for (int i = 0; i<pets.length; i = i + 1){
			if (bigDog.size < pets[i].size){
				bigDog = pets[i];
			}
		}
		
		System.out.println(bigDog.name);
		System.out.println(bigDog.breed);
		System.out.println(bigDog.size);
	}
}