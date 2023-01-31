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
	Dog(){
		this.name = "Dog";
		this.sound = "Bark";
		this.food = "Porridge";
	}
}

class Cat extends Animal{
	Cat(){
		this.name = "Cat";
		this.sound = "Meow";
		this.food = "Jerry";
	}
}

class Lion extends Animal{
	Lion(){
		this.name = "Lion";
		this.sound = "Grrrr..";
		this.food = "Deer";
	}
}

class Deer extends Animal{
	Deer(){
		this.name = "Deer";
		this.sound = "Grunt";
		this.food = "Grass";
	}
}

class Wolf extends Animal{
	Wolf(){
		this.name = "Wolf";
		this.sound = "Wohooo.";
		this.food = "Innocent Animals";
	}
}