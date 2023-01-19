import java.util.Scanner;
import java.lang.*;

class Rectangle{
	String shapeName = "Rectangle";
	private double length, breadth;

	public void set_dim(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the rectangle  : ");
		this.length = sc.nextDouble();
		System.out.print("Enter breadth of the rectangle : ");;
		this.breadth = sc.nextDouble();
	}
	public double getArea(){
		return this.length * this.breadth;
	}
}
class Triangle{
	String shapeName = "Triangle";
	private double base, height;
	
	public void set_dim(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base length   : ");
		this.base = sc.nextDouble();
		System.out.print("Enter height length : ");
		this.height = sc.nextDouble();
	}
	public double getArea(){
		return 0.5 * this.base * this.height;
	}
}
class Circle{
	String shapeName = "Circle";
	private double radius;
	
	public void set_dim(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		this.radius = sc.nextDouble();
	}
	public double getArea(){
		return 3.14 * this.radius * this.radius;
	}
}
class Square{
	String shapeName = "Square";
	private double side;

	public void set_dim(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of the square : ");
		this.side = sc.nextDouble();
	}
	public double getArea(){
		return this.side * this.side;
	}
}
class Ellipse{
	String shapeName = "Ellipse";
	private double majorAxis, minorAxis;

	public void set_dim(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of major axis : ");
		this.majorAxis = sc.nextDouble();
		System.out.print("Enter the length of minor axis : ");
		this.minorAxis = sc.nextDouble();
	}
	public double getArea(){
		return 3.14 * this.majorAxis * 0.5 * this.minorAxis * 0.5;
	}
}

class Parallelogram{
	String shapeName = "Parallelogram";
	private double base, height;

	public void set_dim(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of base : ");
		this.base = sc.nextDouble();
		System.out.print("Enter length of height : ");
		this.height = sc.nextDouble();
	}
	public double getArea(){
		return this.base * this.height;
	}
}

class Driver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true){
			System.out.print("1. Circle\n" + "2. Ellipse\n" + "3. Triangle\n" + "4. Rectangle\n" + "5. Square\n" + "6. Parallelogram\n" + "7. Exit\n");
			System.out.print("C H O O S E : ");
			choice = sc.nextInt();
			switch(choice){
				case 1 :
					Circle myCircle = new Circle();
					myCircle.set_dim();
					System.out.println("Area of " + myCircle.shapeName + " : " + myCircle.getArea());
					break;
				case 2 :
					Ellipse myEllipse = new Ellipse();
					myEllipse.set_dim();
					System.out.println("Area of " + myEllipse.shapeName + " : " + myEllipse.getArea());
					break;
				case 3 :
					Triangle myTriangle = new Triangle();
					myTriangle.set_dim();
					System.out.println("Area of " + myTriangle.shapeName + " : " + myTriangle.getArea());
					break;
				case 4 :
					Rectangle myRectangle = new Rectangle();
					myRectangle.set_dim();
					System.out.println("Area of " + myRectangle.shapeName + " : " + myRectangle.getArea());
					break;
				case 5 :
					Square mySquare = new Square();
					mySquare.set_dim();
					System.out.println("Area of " + mySquare.shapeName + " : " + mySquare.getArea());
					break;
				case 6 :
					Parallelogram myParallelogram = new Parallelogram();
					myParallelogram.set_dim();
					System.out.println("Area of " + myParallelogram.shapeName + " : " + myParallelogram.getArea());
					break;
				case 7 : 
					System.out.println("Thank You for using the program ! ");
					System.exit(0);
				default :
					System.out.println("Invalid choice");
			}
		}
	}
}
