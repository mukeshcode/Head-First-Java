public class Tester{
	public static void main(String[] args){
		A a = new A();
		B b = new B();		
	}
}

class A{
	A(){
		System.out.println("Printing from A");
	}
}

class B extends A{
	B(){
		System.out.println("Printing from B");
	}
}