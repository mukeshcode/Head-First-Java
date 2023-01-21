import java.util.Scanner;
import java.io.*;

public class Knight{
	static int r[] = {-2, -1, 1, 2,  2,  1, -1, -2};
	static int c[] = {1 ,  2, 2, 1, -1, -2, -2, -1};
	static int B[][] = new int[8][8];

	public static void main(String[] args) throws IOException{
		int row, col;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the initial row no. : ");
		row = sc.nextInt();
		System.out.print("Enter the initial col no. : ");
		col = sc.nextInt();
		print();
	}	

	public static 	void print(){
		for(int i = 0; i<8; i++){
			for(int j = 0; j<8; j++)
				System.out.print("  " + B[i][j]);
			System.out.println();
		}
	}


}