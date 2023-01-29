public class OverloadingTest{
	public static void main(String[] args){
		A a = new A();
		a.sayHi(1);
		B b = new B();
		b.sayHi(1);
	}
}

class A{
	void sayHi(int a){
		System.out.println("Printing from the A ...");
	}
}	

class B extends A{
	boolean sayHi(int b){
		System.out.println("Printing from the B...");
		return true;
	}
}