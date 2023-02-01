public class InheritanceFlowTest{
	public static void main(String[] args){
		//A a = new A();
		//B b = new B();
		A a = new B();	
	}
}

class A{
	A(){System.out.println("I am in A ");}
}
class B extends A{
	B(){System.out.println("I am in B");}
}