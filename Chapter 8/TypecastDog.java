public class TypecastDog{
	public static void main(String[] args){
		Object o = new Dog();
		((Cat)(o));
	}
}

class Dog{
	void bark(){
		System.out.println("Bark ! Bark ! ");
	}
}
class Cat{
	void meow(){
		System.out.println("Meow ! Meow ! ");
	}
}