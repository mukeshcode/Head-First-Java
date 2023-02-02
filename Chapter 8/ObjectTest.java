public class ObjectTest{
	public static void main(String[] args){
		AnimalList myList = new AnimalList();
		Dog d = new Dog();
		Cat c = new Cat();
		Wolf w = new Wolf();

		myList.add(d);
		myList.add(c);
		myList.add(w);
	}
}

class AnimalList{
	private Animal[] myAnimals = new Animal[5];
	private int nextInd = 0;

	public void add(Object animal){
		if(this.nextInd < 5){
			animal.makeSound();
		}
	}
}

abstract class Animal{
	private String name;
	
	void setName(String s){this.name = s;}
	String getName(){return this.name;}
	abstract void makeSound();
}

class Dog extends Animal{
	Dog(){this.setName("DOG");}
	void makeSound(){System.out.println("Bark ! Bark !");}
}

class Cat extends Animal{
	Cat(){this.setName("CAT");}
	void makeSound(){System.out.println("Cat ! Cat ! ");}
}

class Wolf extends Animal{
	Wolf(){this.setName("WOLF");}
	void makeSound(){System.out.println("Wohoo ! Wohoo ! ");}
}