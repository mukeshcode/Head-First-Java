import java.util.Scanner;

class Rectangle{
	float length, breadth;

	void readSides(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length  : ");
		this.length = sc.nextFloat();
		System.out.print("Enter breadth : ");
		this.breadth = sc.nextFloat();		
	}

	float getArea(){
		return this.length * this.breadth;
	}
}

class Driver{
	public static void main(String[] args){
		Rectangle rect = new Rectangle();
		rect.readSides();
		System.out.println("Area : " + rect.getArea());
	}
}