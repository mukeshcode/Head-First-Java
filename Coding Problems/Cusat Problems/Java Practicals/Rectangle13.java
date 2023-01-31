import java.util.Scanner;

public class Rectangle13{
	public static void main(String[] args){
		Rect rect = new Rect();
		System.out.print("Rectangle area : " + rect.getArea());
	}
}

class Rect{
	double length, width;

	Rect(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		this.length = sc.nextDouble();
		System.out.print("Enter width  : ");
		this.width = sc.nextDouble();
	}

	double getArea(){return this.length * this.width;}
}

