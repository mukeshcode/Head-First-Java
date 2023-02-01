public class AnimalListTestDrive{
	public static void main(String[] args){
		AnimalList anim_list = new AnimalList();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Wolf wolf = new Wolf();
		anim_list.add(dog);
		anim_list.add(cat);	
		anim_list.add(wolf);

		Cat cat2 = new Cat();
		Dog dog2 = new Dog();
		anim_list.add(cat2);
		anim_list.add(dog2);

		Wolf wolf2 = new Wolf();
		anim_list.add(wolf2);
	}
}

abstract class Animal{
	private String name;

	public void setName(String s){this.name = s;}

	abstract public void makeSound();
	String getName(){return this.name;}
}

class Dog extends Animal{
	Dog(){this.setName("Dog");}
	public void makeSound(){System.out.println("Bark ! Bark ! ");}
}
class Cat extends Animal{
	Cat(){this.setName("Cat");}
	public void makeSound(){System.out.println("Meow ! Meow ! ");}
}
class Wolf extends Animal{
	Wolf(){this.setName("Wolf");}
	public void makeSound(){System.out.println("Wohooo. Wohooo. ");}
}

class AnimalList{
	private Animal[] myAnimals = new Animal[5];
	int nextIndex = 0;

	void add(Animal animal){
		if(nextIndex < myAnimals.length){
			myAnimals[this.nextIndex] = animal;
			System.out.println("New animal " + animal.getName() + " added at pos .  : " + this.nextIndex);
			this.nextIndex++;
		}else{
			System.out.println("AnimalList already full ! ");
		}
	}
}