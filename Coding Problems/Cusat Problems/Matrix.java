import java.util.Scanner;

public class Matrix{
	public static void main(String[] args){
		int row1, col1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows for Matrix 1 : ");
		row1 = sc.nextInt();
		System.out.print("Enter cols for Matrix 2 : ");
		col1 = sc.nextInt();

		int[][] mat1 = new int[row1][col1];

		//Taking input for the matrix1
		for(int i = 0; i<row1; i++){
			for(int j = 0; j<col1; j++){
				System.out.print("Row " + (i+1) + ", Col " + (j+1) + ", Element : ");
				mat1[i][j] = sc.nextInt();
			}
		}

		//Displaying matrix1
		for(int i = 0; i<row1; i++){
			for(int j = 0; j<col1; j++)
				System.out.print(mat1[i][j] + "\t");
			System.out.println();
		}
		
		//Taking input for the second matrix
		int row2, col2;
		System.out.print("Enter rows for Matrix 2 : ");
		row2 = sc.nextInt();
		System.out.print("Enter cols for Matrix 2 : ");
		col2 = sc.nextInt();

		int[][] mat2 = new int[row2][col2];

		//Taking input for the second matrix
		for(int i = 0; i<row2; i++){
			for(int j = 0; j<col2; j++){
				System.out.print("Row : " + (i+1) + ", Col : " + (j+1) + ", Element : ");
				mat2[i][j] = sc.nextInt();
			}
		}
		//Displaying the second matrix
		for(int i = 0; i<row2; i++){
			for(int j = 0; j<col2; j++)
				System.out.print(mat2[i][j] + "\t");
			System.out.println();
		}

		System.out.println("Trying to add");
		if(row1 == row2 && col1 == col2){
			for(int i = 0; i<row1; i++){
				for(int j = 0; j<col1; j++)
					System.out.print(mat1[i][j] + mat2[i][j] + "\t");
				System.out.println();
			}
		}
		else{
			System.out.println("Addition not possible!");
		}

		System.out.println("Try for matrix multiplication");
		if(col1 == row2){
			int row3 = row1, col3 = col2;
			for(int i = 0; i<row3; i++){
				for(int j = 0; j<col3; j++){
					//'i' is my row no. in the first matrix
					//'j' is my col no. in the second matrix
					//'k' will iterate
					int sum = 0;
					for(int k = 0; k < col1; k++)
						sum += mat1[i][k] * mat2[k][j];
					System.out.print(sum + "\t");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Matrix multiplication not possible");

	}
}