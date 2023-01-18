import java.util.Scanner;

class QuadraticEq{
	double a, b, c;
	double[] x;
	
	void createEq(){
		Scanner sc = new Scanner(System.in);

		do{
			System.out.print("Enter coefficient of x^2 : ");
			this.a = sc.nextDouble();
			if(this.a == 0)
				System.out.println("You are making it linear ! Not allowed !!");
		}while(this.a == 0);

		System.out.print("Enter coefficient of x   : ");
		this.b = sc.nextDouble();
		System.out.print("Enter the constant term  : ");
		this.c = sc.nextDouble();
	}	
	
	void solveEquation(){
		double discriminant;
		discriminant = (this.b * this.b) - (4 * this.a * this.c);
		
		if(discriminant < 0){
			System.out.println("Real solutions not possible !");
		}
		else{
			x = new double[2];
			x[0] = (-this.b + discriminant)/2*this.a;
			x[1] = (-this.b - discriminant)/2*this.a;
		
			if(discriminant == 0)
				System.out.println("Only one solution : " + x[0] + ", " + x[1]);
			else
				System.out.println(" Unique solutions : " + x[0] + ", " + x[1]);
		}
	}
}

class QuadraticTest{
	public static void main(String[] args){
		QuadraticEq eq1 = new QuadraticEq();
		
		eq1.createEq();
		eq1.solveEquation();
	}
}