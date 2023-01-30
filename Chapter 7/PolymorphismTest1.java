public class PolymorphismTest1{
	public static void main(String[] args){
		A obj = new B();

		obj.sayHello();
	}
}

class A{
	Integer sayHello(){
		System.out.println("Hello from A");
		return 0;
	}
}

class B extends A{
	int sayHello(){
		System.out.println("Hello from B");
		return 0;
	}
}