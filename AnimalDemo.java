package codingPractiseTest;

class Animal{
	void shout() {
	}	
}

class Dog extends Animal{
	@Override
	void shout() {
		System.out.println("Dog : Bark");
	}
}

class Horse extends Animal{
	@Override
	void shout() {
		System.out.println("Horse : Neigh");
	}
}

class Cat extends Animal{
	@Override
	void shout() {
		System.out.println("Cat : Meow");
	}
}


public class AnimalDemo {

	public static void main(String[] args) {

		Dog dog=new Dog();
		Horse horse=new Horse();
		Cat cat=new Cat();

		dog.shout();
		horse.shout();
		cat.shout();


	}

}
