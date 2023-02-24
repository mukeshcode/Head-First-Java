import java.util.*;

public class Linked_SymmetricTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of the square matrix : ");
        int n = sc.nextInt();

        LinkedList<Integer>[] myMatrixList = new LinkedList[n];
        for(int i = 0; i<n; i++)
            myMatrixList[i] = new LinkedList<Integer>();

        for(int i = 0; i<n; i++){
            System.out.println("Enter the elements of the matrix : ");
            for(int j = 0; j<n; j++){
                System.out.print("[" + i + "][" + j + "]" + " = ");
                myMatrixList[i].add(sc.nextInt());
            }
        }

        for(LinkedList<Integer> ll : myMatrixList){
            for(Integer x : ll)
                System.out.print(x + " ");
            System.out.println();
        }

        sc.close();
    }
}
