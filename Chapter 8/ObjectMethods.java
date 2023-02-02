public class ObjectMethods{
	public static void main(String[] args){
		Dog d = new Dog();
		Cat c = new Cat();
		Dog d2 = new Dog();

		if(d.equals(d2))
			System.out.println("Dog and Cat are equal ! ");
		else
			System.out.println("Not equal");

		System.out.println("d comes from : " + d.getClass());
		System.out.println("c comes from : " + c.getClass());

		System.out.println("d's hashcode : " + d.hashCode());

		System.out.println("c's toString : " + c.toString());
	}
}

