import java.util.Scanner;

class Rectangle{
	private double length, breadth;

	public void set_dim_rect(){
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
	private double base, height;
	
	public void set_dim_tri(){
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
	private double radius;
	
	public void set_radius(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		this.radius = sc.nextDouble();
	}
	public double getArea(){
		return 3.14 * this.radius * this.radius;
	}
}
class Square{
	private double side;

	public void set_side(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of the square : ");
		this.side = sc.nextDouble();
	}
	public double get_area(){
		return this.side * this.side;
	}
}
class Ellipse{
	private double majorAxis, minorAxis;

	public void setAxis(){
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
	private double base, height;

	public void setDim(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of base : ");
		this.base = sc.nextDouble();
		System.out.print("Enter length of height : ");
		this.height = sc.nextDouble();
	}
}

class Driver{
	public static void main(String[] args){
		Rectangle rect = new Rectangle();
		rect.createRectangle();
		System.out.println("Area of Rectangle : " + rect.getArea());
	}
}
