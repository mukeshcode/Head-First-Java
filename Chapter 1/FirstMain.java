import java.util.Scanner;

public class FirstMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int repeat;

		System.out.print("Enter the no. of occurrences : ");
		repeat = sc.nextInt();
		chant(repeat);
	}
	public static void chant(int x){
		while(x > 0){
			System.out.print("Haribol!");
			x--;
		}
	}
}

public class SecondMain{
	public static void main(String[] args){
		roar(5);
	}
	public static void roar(int x){
		while(x > 0){
			System.out.print("Zzz...");
			x--;
		}
	}
}