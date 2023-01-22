import java.io.*;
import java.util.*;

public class Knight{
	static int [] R = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int [] C = {1, 2, 2, 1, -1, -2, -2, -1};
	static int [][] B = new int[8][8];

	static void print(){
		for(int i = 0; i<8; i++){
			for(int j = 0; j<8; j++)
				System.out.print(" "+ B[i][j]);
			System.out.println();
		}
	}

	static boolean inside(int r, int c){
		return ((r >= 0)&&(r < 8)&&(c >=0)&&(c < 8));
	}	

	static int count(int r, int c){
		int m = 0; 	// total options to move
		for(int i = 0; i<8; i++){
			int newR = r + R[i];
			int newC = c + C[i];
			if(inside(newR, newC) && B[newR][newC] == 0)
				m++;
		}
		return m;
	}

	static int bestMove(int r, int c){
		int minNoMove = 9, minIdx = 9;

		for(int i = 0; i<8; i++){
			int newR = r + R[i];
			int newC = c + C[i];
			if(inside(newR, newC) && B[newR][newC] == 0){
				int tempMove = count(newR, newC);
				if(tempMove < minNoMove){
					minNoMove = tempMove;
					minIdx = i;
				}
			}
		}
		return minIdx;
 	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int r, c, newR, newC;
		int k = 1, n = 63;
		int i, j;	
		int move;

		System.out.print("Enter your initial position : ");
		r = sc.nextInt();
		c = sc.nextInt();

		B[r][c] = k;
		
		print();

		while(k <= n){
			if((move = bestMove(r, c)) < 9){
				r += R[move];
				c += C[move];
				B[r][c] = ++k;
			}
		}
		print();
	}

}