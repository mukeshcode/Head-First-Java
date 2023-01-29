import java.util.Scanner;

class Check{
	public static void main(String[] args){
		B objB = new B();
		System.out.println("Value in B : " + objB.getValue());
		System.out.println("Value in B through . : " + objB.value);
	}
}

class A{
	public int value = 10;

	public void setValue(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		this.value = sc.nextInt();
	}

	public int getValue(){
		return this.value;
	}
}

class B extends A{
	int value = 20;
	
	public int getValue(){
		System.out.println("Value in B : " + super.getValue());
		return this.value;
	}
}