public class InheritTest1{
	public static void main(String[] args){
		B b = new B();
		b.setA();	
	}
}

class A{
	private int a;

	public void setA(){
		//a = 45;
		System.out.println("Setting from the A");
	}
	public int getA(){
		return this.a;
	}
}

class B extends A{
	void printSome(){
		System.out.println("Value of 'a' from B : " + this.getA());
	}	
}