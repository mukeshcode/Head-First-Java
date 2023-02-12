import java.util.Scanner;

class QuadraticPoly{
	private double a, b, c;

	QuadraticPoly(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1st constructor");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();		
	}
	QuadraticPoly(double a, double b, double c){
		System.out.println("2st constructor");
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA(){return a;}
	public double getB(){return b;}
	public double getC(){return c;}

	void addPoly(QuadraticPoly eq2){
		double newA = a + eq2.getA();
		double newB = b + eq2.getB();
		double newC = c + eq2.getC();

		System.out.println(newA + "x^2 + " + newB + "x + " + newC);
	}
}

public class QuadraticTest{
	public static void main(String args[]){
		QuadraticPoly eq1 = new QuadraticPoly();
		System.out.println(eq1.getA()+"x^2 +  " + eq1.getB() + "x +  " + eq1.getC());
		QuadraticPoly eq2 = new QuadraticPoly(2.0, 3.0, 1.0);
		System.out.println(eq2.getA()+"x^2 +  " + eq2.getB() + "x +  " + eq2.getC());
		eq1.addPoly(eq2);
	}
}