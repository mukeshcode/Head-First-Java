import java.util.Scanner;

class Matrix{
    private int row, col;
    private int [][] mat;

    Matrix(){
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        row = sc.nextInt();
        System.out.print("Enter col : ");
        this.col = sc.nextInt();

        this.mat = new int[this.row][this.col];
        for(int i = 0; i<this.row; i++)
            for(int j = 0; j<this.row; j++)
                this.mat[i][j] = sc.nextInt();
    }

    public int getMinColInd(int[] arr){
        int min = 0;
        for(int i = min+1; i<arr.length; i++){
            if(arr[i] < arr[min])
                min = i;
        }
        return min;
    }

    public void printSaddlePoint(){
        for(int i = 0; i<this.row; i++){
            int minColInd = this.getMinColInd(this.mat[i]);
            int value = this.mat[i][minColInd];
            boolean isSaddlePoint = true;

            for(int row_i = 0; row_i<this.row; row_i++){
                if(this.mat[row_i][minColInd] > value){
                    isSaddlePoint = false;
                    break;
                }
            }
            if(isSaddlePoint)
                System.out.println("Saddle point : " + value);
        }
    }

}

class SaddleTest {
    public static void main(String[] args){
        Matrix m1 = new Matrix();
        m1.printSaddlePoint();
    }
}
