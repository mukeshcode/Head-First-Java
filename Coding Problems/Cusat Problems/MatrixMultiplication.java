import java.util.Scanner;

class Matrix{
	private int rows, cols;
	private int[][] mat;

	public void setDimensions(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		this.rows = sc.nextInt();
		System.out.print("Enter no. of cols : ");
		this.cols = sc.nextInt();
	}
	public void setMatrix(){
		Scanner sc = new Scanner(System.in);
		mat = new int[this.rows][this.cols];
		for(int i = 0; i<this.rows; i++)
			for(int j = 0; j<this.cols; j++)
				this.mat[i][j] = sc.nextInt();
	}
	public void displayMat(){
		for(int i = 0; i<this.rows; i++){
			for(int j = 0; j<this.cols; j++)
				System.out.print(this.mat[i][j]);
			System.out.println();
		}
	}
	public void prodMat(Matrix m2){
		if(this.cols == m2.rows){
			for(int i = 0; i<this.rows; i++){
				for(int j = 0; j<m2.cols; j++){
					int sum = 0;
					for(int k = 0; k<this.cols; k++){
						sum += this.mat[i][k]*m2.mat[k][j];
					}	
					System.out.print(sum + "\t");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Matrix Multiplication not possible !");
	}
}

class MatrixDriver{
	public static void main(String[] args){
		Matrix m1 = new Matrix();
		m1.setDimensions();
		m1.setMatrix();
		
		Matrix m2 = new Matrix();
		m2.setDimensions();
		m2.setMatrix();

		m1.prodMat(m2);
	}
}