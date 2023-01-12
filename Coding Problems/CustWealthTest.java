import java.util.Scanner;


class Solution {
    public int maximumWealth(int[][] accounts) {
		int rows, cols, max;	
		rows = accounts.length;
		cols = accounts[0].length;

		max = 0;
		for(int i = 0; i<rows; i++){
			int sum = 0;
			for(int j = 0; j<cols; j++){
				sum += accounts[i][j];
			}
			if(max < sum)
				max = sum;
		}

		return max;
    }
}


public class CustWealthTest{
	public static void main(String[] args){
		int row, col;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows : ");
		row = sc.nextInt();
		System.out.print("Enter cols : ");
		col = sc.nextInt();

		int[][] matrix = new int[row][col];

		for(int i = 0; i < row; i++){
			for(int j = 0; j<col; j++){
				System.out.print("Row : " + i + ", Col : " + j + ", Element : ");
				matrix[i][j] = sc.nextInt();
			}
		}		

		System.out.println("Printing your matrix");
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}

		Solution sol = new Solution();
		int maximumWealth = sol.maximumWealth(matrix);
		System.out.println("Maximum Wealth : " + maximumWealth);
	}
}