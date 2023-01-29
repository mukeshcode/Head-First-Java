//Program to find the saddle point of the matrix

import java.util.Scanner;

public class SaddleTestDrive2{
	public static void main(String[] args){
		Matrix mat = new Matrix();
		mat.setDim();
		mat.setMatrix();
		mat.printSaddlePoint();
	}
}

class Matrix{
	private int rows, cols;
	private int[][] matrix;

	public void setDim(){
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

	public void printSaddlePoint(){
		for(int[] row : this.matrix){				// for each row in the matrix
				int min_index = 0;					// find the smallest element
				for(int j = 0; j<this.cols; j++){// for each element in the row
					if(row[min_index] > row[j])
						min_index = j;
				}
				// the smallest element at the particular row will be positioned at the min_index col.
				boolean isASaddlePoint = true;
				for(int i = 0; i<this.rows; i++){
					if(row[min_index] < this.matrix[i][min_index]){
						isASaddlePoint = false;
						break;
					}
				}
				if(isASaddlePoint)
					System.out.println("Saddle Point : " + row[min_index]);
		}		
	
	}
}