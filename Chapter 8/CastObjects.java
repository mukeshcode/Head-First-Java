import java.util.ArrayList;

public class CastObjects{
	public static void main(String[] args){
		Dog dog1 = new Dog("dog1");
		Dog dog2 = new Dog("dog2");
		Dog dog3 = new Dog("dog3");
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add(dog1);
		myList.add(dog2);
		myList.add(dog3);

		System.out.println(myList);
		
		//Retrieving it
		Object dog4 = myList.get(0);
		//dog4.setName("Tommy");
		System.out.println(dog4);
		//System.out.println(dog1);	
		Dog dog5 = (Dog)dog4;
		System.out.println(dog5);
	}
}

class Dog{
	private String name;
	

	Dog(String s){this.name = s;}
	public String getName(){return this.name;}
	//public String toString(){return this.name;}
	void setName(String s){this.name = s;}
	void makeSound(){System.out.println("Bark ! Bark !");}
	void eat(){System.out.println("Yummy ! my porridge is amazing ! ");}
	void fight(){System.out.println("Hey ! other dog, how dare you enter my territory ! ");}
}