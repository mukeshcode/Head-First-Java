public class HypotenuseGen{
	public static void main(String[] args){
		for(int i = 1; i<50; i++){
			for(int j = 1; j<i; j++){
				for(int k = 1; k<i; k++){
					int sum = j*j + k*k;
					if(i*i == sum){
						System.out.print(i + " = " + j + ", " + k + "\t");
					}
				}
			}
			System.out.println();
		}
	}
}