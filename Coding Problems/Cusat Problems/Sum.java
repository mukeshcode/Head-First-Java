import java.util.Scanner;

public class Sum{
	public static void main(String[] args){
		int a, b, sum;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number in Integer  : ");
		a = sc.nextInt();

		System.out.print("Enter second number in Integer : ");
		b = sc.nextInt();

		sum = a+b;		

		System.out.print("Sum : " + sum);
	}
}