import java.util.Scanner;

public class LinearSearch{
	public static void main(String[] args){
		int size, i;	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the Integer array : ");
		size = sc.nextInt();

		int[] array = new int[size];
		for(i = 0; i<size; i++){
			System.out.print("Element No. " + (i+1) + ": ");
			array[i] = sc.nextInt();	
		}

		int elem;
		System.out.print("Enter the element to search : ");
		elem = sc.nextInt();

		for(i = 0; i<size; i++){
			if(elem == array[i]){
				System.out.print("Element " + elem + " found at pos. " + (i+1) + ".");
				break;
			}
		}
		if(i == size)
			System.out.print("Element " + elem + " not in the array.");
	}
}