public class VetenaryTest{
	public static void main(String[] args){
		Vetenary vet = new Vetenary();

		Animal[] myPets = new Animal[3];
		
		myPets[0] = new Dog();
		myPets[1] = new Cat();
		myPets[2] = new Squirrel();

		for(Animal animal : myPets){
			vet.treatAnimal(animal);
		}
	}
}

class Vetenary{
	void treatAnimal(Animal animal){
		animal.giveInjection();
		animal.makeSound();
		animal.goRun();
	}
}

abstract class Animal{
	private String name;
	
	void setName(String str){this.name = str;}
	abstract void giveInjection();
	abstract void makeSound();
	abstract void goRun();
}

class Dog extends Animal{
	Dog(){this.setName("Dog");}

	void giveInjection(){System.out.println("Bark! Bark! I need injection ! ");}
	void makeSound(){System.out.println("Bark ! Bark !");}
	void goRun(){System.out.println("Bark ! Runs.. Bark ! Runs..");}
}

class Cat extends Animal{
	Cat(){this.setName("Cat");}

	void giveInjection(){System.out.println("Meow! Meow! I want injection ! ");}
	void makeSound(){System.out.println("Meow ! Meow ! ");}
	void goRun(){System.out.println("Meow ! Runs .. Meow ! Runs ..");}
}

class Squirrel extends Animal{
	Squirrel(){this.setName("Squirrel");}

	void giveInjection(){System.out.println("Squeak ! Squeak ! I require injection");}
	void makeSound(){System.out.println("Squeak ! Squeak ! ");}
	void goRun(){System.out.println("Squeak ! Squeak ! Oo. Run...");}
}

