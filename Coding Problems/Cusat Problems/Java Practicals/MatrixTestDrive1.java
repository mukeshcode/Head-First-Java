// 1. A program to add two integer matrices

import java.util.Scanner;

class Matrix{
	private int rows, cols;
	private int[][] matrix;

	public void setDimensions(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		this.rows = sc.nextInt();
		System.out.print("Enter cols : ");
		this.cols = sc.nextInt();
	}
	public void setMatrix(){
		Scanner sc = new Scanner(System.in);
		this.matrix = new int[this.rows][this.cols];

		for(int i = 0; i<this.rows; i++)
			for(int j = 0; j<this.cols; j++)
				this.matrix[i][j] = sc.nextInt();
	}

	public void addMatrix(Matrix mat2){
		if(this.rows == mat2.rows && this.cols == mat2.cols){
			for(int i = 0; i<this.rows; i++){
				for(int j = 0; j<this.cols; j++)	
					System.out.print(this.matrix[i][j] + mat2.matrix[i][j] + "\t");
				System.out.println();
			}
		}else{
			System.out.println("Compatibility issues ! Dimensions doesn't match !!");
		}
	}
}




public class MatrixTestDrive1{
	public static void main(String[] args){
		Matrix m1 = new Matrix();
		Matrix m2 = new Matrix();

		System.out.println("----M A T R I X   1----");
		m1.setDimensions();
		m1.setMatrix();

		
		System.out.println("\n----M A T R I X   2----");
		m2.setDimensions();
		m2.setMatrix();

		System.out.println("Adding matrix 2 to matrix 1");
		m1.addMatrix(m2);
	}
}

