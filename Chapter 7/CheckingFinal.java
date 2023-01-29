public class CheckingFinal{
	public static void main(String[] args){
		A myA = new A();
		System.out.println("From A : " + myA.a);
		B myB = new B();
		System.out.println("From B : " + myB.a);
	}
}

class A{
	int a = 12;
	final void A(){
		System.out.println("printing from the constructor");
	}
}

class B extends A{
	int a = 123;
}