import java.util.Scanner;

class Matrix{
	int rows, cols;
	int[][] mat;

	void readMatrix(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		this.rows = sc.nextInt();
		System.out.print("Enter cols : ");
		this.cols = sc.nextInt();

		mat = new int[rows][cols];
		for(int i = 0; i<this.rows; i++){
			for(int j = 0; j<this.cols; j++){
				System.out.print("Rows : " + (i+1) + ", Cols : " + (j+1) + ", Element : ");
				this.mat[i][j] = sc.nextInt();
			}
		}
	}

	void addMatrix(Matrix matrix){
		if(this.rows == matrix.rows && this.cols == matrix.cols){
			System.out.println("Matrix Addition possible");
			for(int i = 0; i<this.rows; i++){
				for(int j = 0; j<this.cols; j++){
					System.out.print(this.mat[i][j] + matrix.mat[i][j] + "\t");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Matrix addition not possible!");
	}
}

class MatrixDrive{
	public static void main(String[] args){
		Matrix matrix1 = new Matrix();
		matrix1.readMatrix();

		Matrix matrix2 = new Matrix();
		matrix2.readMatrix();

		matrix1.addMatrix(matrix2);
	}
}