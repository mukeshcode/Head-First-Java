import java.util.Scanner;

public class AnimalsTestDrive{
	public static void main(String[] args){
		Animal[] myAnimals = new Animal[5];

		myAnimals[0] = new Dog();
		myAnimals[1] = new Cat();
		myAnimals[2] = new Lion();
		myAnimals[3] = new Deer();
		myAnimals[4] = new Wolf();

		for(int i = 0; i<myAnimals.length; i++){
			myAnimals[i].makeSound();
			myAnimals[i].eat();
		}
	}
}

class Animal{
	String name = "Animal", sound = "Anime", food = "grass";
	void makeSound(){
		System.out.println("I am " + name + "..." + sound + " .. "+ sound);
	}
	void eat(){
		System.out.println("I'm " + name + "... Give me my " + food + "!");
	}
}

class Dog extends Animal{
	String name;
	String sound;
	String food;

	void Dog(){
		this.name = "Dog";
		this.sound = "Bark";
		this.food = "Porridge";
	}
	void makeSound(){
		System.out.println("I am " + this.name + "..." + this.sound + " .. "+ this.sound);
	}
	void eat(){
		System.out.println("I'm " + this.name + "... Give me my " + this.food + "!");
	}

}

class Cat extends Animal{
	String name = "Cat";
	String sound = "Meow";
	String food = "Jerry";
}

class Lion extends Animal{
	String name = "Lion";
	String sound = "Grrrrrrrr....";
	String food = "humans";
}

class Deer extends Animal{
	String name = "Deer";
	String sound = "Grunt..";
	String food = "grass";
}

class Wolf extends Animal{
	String name = "Wolf";
	String sound = "Wooo..";
	String food = "deeeeer";
}