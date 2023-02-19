public class ArrayTest{
	public static void main(String[] args){
		int [][] arr = new int[4][];
		arr[0] = new int[4];
		arr[1] = new int[1];
		arr[2] = new int[3];
		arr[3] = new int[2];

		for(int x[] : arr){
			for(int y : x)
				System.out.print(y);
			System.out.println();
		}
	}
}