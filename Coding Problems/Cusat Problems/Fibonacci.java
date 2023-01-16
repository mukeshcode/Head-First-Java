import java.util.Scanner;

class FibonacciMachine{
	int limit;
	
	void setLimit(){	
		Scanner sc = new Scanner(System.in);
		System.out.print("Set the limit to : ");
		this.limit = sc.nextInt();
	}
	int getLimit(){
		return this.limit;
	}

	void genFibonacci(){
		int first, second, third;
		first = 0; second = 1;
		for(int i = 1; i<=this.limit; i++){
			System.out.print(first + "\t");
			third = first + second;
			first = second;
			second = third;
		}
	}

}

class TestDrive{
	public static void main(String[] args){
		FibonacciMachine myMachine = new FibonacciMachine();

		myMachine.setLimit();
		myMachine.genFibonacci();
	}
}