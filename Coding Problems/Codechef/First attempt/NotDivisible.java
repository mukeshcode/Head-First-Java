import java.util.Scanner;

public class NotDivisible{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		for(int t = sc.nextInt(); t>0; t--){
			int n = sc.nextInt();
			for(int i = 0; i<n; i++){
				if(i%2 == 0)
					System.out.print("0 ");
				else 
					System.out.print("1 ");
			}
		}
	}
}