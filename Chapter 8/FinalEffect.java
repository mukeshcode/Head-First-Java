public class FinalEffect{
	public static void main(String[] args){
		B b = new B();
	}
}

class A{
	final void printA(){System.out.println("I'm printing from Class A ");}
}

class B extends A{
	void printA(){System.out.println("Class B");}
}