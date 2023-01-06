import java.util.Scanner;

public class NumberOfSteps{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num, cnt = 0;

		System.out.print("Enter number : ");
		num = sc.nextInt();
		while(num > 0){
			if(num % 2 == 0)
				num = num/2;
			else
				num = num-1;
			cnt++;
		}	
		System.out.println("Number of steps : " + cnt);

	}
}