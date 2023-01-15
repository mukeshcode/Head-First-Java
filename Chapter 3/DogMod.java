class Dog{
	String name;
	
	void bark(){
		System.out.println("Ruff ! Ruff !");
	}
	void barkAMan(){
		System.out.print("Hey ! " + this.name + " Don't let him get in ! " + this.name + " says : ");
		bark();
	}
}

class DogTestDrive{
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.name = "Bart";
		d1.bark();	
		d1.barkAMan();

		Dog d2 = new Dog();
	}
}
