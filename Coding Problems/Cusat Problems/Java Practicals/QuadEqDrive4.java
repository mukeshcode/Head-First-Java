// 4. Program to calculate the roots of the given quadratic eq.
import java.util.Scanner;

public class QuadEqDrive4{
	public static void main(String[] args){
		QuadEq eq1 = new QuadEq();
		eq1.setParam();
		eq1.calcRoot();
	}
}

class QuadEq{
	private double a, b, c;
	private double[] roots;

	public void setParam(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter coeffecient of x^2 : ");
		this.a = sc.nextDouble();
		System.out.print("Enter coefficient of x   : ");
		this.b = sc.nextDouble();
		System.out.print("Enter constant term      : ");
		this.c = sc.nextDouble();
	}
	public void calcRoot(){
		double disc;
		disc = (this.b * this.b) - 4 * this.a * this.c;
		if(disc < 0)
			System.out.println("Real Roots Not possible !!");
		else{
			double x = (-this.b + Math.sqrt(disc))/(2 * this.a);
			double y = (-this.b - Math.sqrt(disc))/(2 * this.a);
			this.roots = new double[2];
			roots[0] = x;
			roots[1] = y;
			if(disc == 0)
				System.out.print("Quadratic eq. has equal roots !  : ");
			else
				System.out.print("Quadratic eq. has unique roots ! : ");
			System.out.println(this.roots[0] + ", " + this.roots[1]);
		}
	}
	
}