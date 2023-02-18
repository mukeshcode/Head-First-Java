import java.util.Scanner;

class Matrix{
    private int row, col;
    private int [][] mat;

    Matrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---- CREATING MATRIX ----");
        System.out.print("Enter rows : ");
        this.row = sc.nextInt();
        System.out.print("Enter cols : ");
        this.col = sc.nextInt();

        this.mat = new int[this.row][this.col];
        for(int i = 0; i<this.row; i++)
            for(int j = 0; j<this.col; j++)
                this.mat[i][j] = sc.nextInt();
    }

    public void addMatrix(Matrix m2){
        System.out.println("---- ADDING MATRIX 1 AND 2 ----");
        if(this.row == m2.row && this.col == m2.col){
            for(int i = 0; i<this.row; i++){
                for(int j = 0; j<this.col; j++)
                    System.out.print((this.mat[i][j] + m2.mat[i][j]) + "\t");
                System.out.println();
            }
        }else{
            System.out.println("Dimensions incompatible for adding !");
        }
    }
}

class MatrixTest{
    public static void main(String[] args){
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        m1.addMatrix(m2);
    }
}