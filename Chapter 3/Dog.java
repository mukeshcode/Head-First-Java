class Dog{
	String name;

	public static void main(String[] args){
		Dog d1 = new Dog();

		d1.name = "Bart";
		d1.bark();
		

		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = d1;

		myDogs[0].name = "Fret";
		myDogs[1].name = "Marge";

		int x = 0;
		while(x < myDogs.length){	// arrays have an attribute called length
			System.out.println("\n" + myDogs[x].name + " says ");
			bark();
			x += 1;
		}
		

	}
	void bark(){
			System.out.print(name + " Ruff ! Ruff !");
	}
	void barkAMan(){
			bark();
			System.out.print("Hey ! Man ! don't get in ");
	}
}