import java.util.Scanner;

public class QuadraticTest9{
	public static void main(String[] args){
		QuadraticPolynomial quadpoly1 = new QuadraticPolynomial();
		quadpoly1.setCoeff();
		quadpoly1.printPoly();
		
		QuadraticPolynomial quadpoly2 = new QuadraticPolynomial();
		quadpoly2.setCoeff();
		quadpoly2.printPoly();

		quadpoly1.addQuadPoly(quadpoly2);
	}
}

class QuadraticPolynomial{
	private double a, b, c;

	public void setCoeff(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter coeff. of x^2 : ");
		this.a = sc.nextDouble();
		System.out.print("Enter coeff. of x   : ");
		this.b = sc.nextDouble();
		System.out.print("Enter constant term : ");
		this.c = sc.nextDouble();
	}
	
	public void printPoly(){
		System.out.println("Quadratic Polynomial : " + this.a + "x^2 + " + this.b + "x + " + this.c);
	}

	public void addQuadPoly(QuadraticPolynomial quad2){
		double a, b, c;
		a = this.a + quad2.a;
		b = this.b + quad2.b;	
		c = this.c + quad2.c;
		
		System.out.println("Sum : " + a + "x^2 + " + b + "x + " + c);
	}
	
}