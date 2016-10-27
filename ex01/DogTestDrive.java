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
		Dog barksy = new Dog();
		barksy.size = 40;
		barksy.bark();
		Cat catsy = new Cat();
		catsy.size = 12;
		catsy.bark();
		catsy.breed = "Maine Coon";
	}
}