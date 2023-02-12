import java.util.Scanner;

class Rectangle{
	private double length, breadth;

	Rectangle(){
		Scanner sc = new Scanner(System.in);
		this.length = sc.nextDouble();
		this.breadth = sc.nextDouble();
	}

	double getArea(){return this.length * this.breadth;}
}

public class RectangleTest{
	public static void main(String[] args){
		Rectangle myRect = new Rectangle();
		System.out.println(myRect.getArea());
	}
}