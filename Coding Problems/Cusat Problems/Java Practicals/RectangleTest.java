// 6. Program to calculate the area of rectangle given its length and breadth

import java.util.Scanner;

class Rectangle{
	private double length, breadth;
	
	public void setDim(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length  : ");
		this.length = sc.nextDouble();
		System.out.print("Enter breadth : ");
		this.breadth = sc.nextDouble();
	}

	double getArea(){return (this.length * this.breadth);}
}

public class RectangleTest{
	public static void main(String args[]){
		Rectangle rect = new Rectangle();
		rect.setDim();
		System.out.println("Area : " + rect.getArea());
	}
}