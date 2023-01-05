import java.util.Scanner;

public class RansomNote{
	public static void main(String[] args){
		String ransomNote, magazine;
		int i, j;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter RansomNote : ");
		ransomNote = sc.next();
		System.out.print("Enter Magazine   : ");
		magazine = sc.next();

		int ran_len = ransomNote.length();
		int mag_len = magazine.length();

		if(mag_len < ran_len)
			System.out.println("Not possible");
		else{
			int[] visited = new int[mag_len];
			for(i = 0; i<mag_len; i++)
				visited[i] = 0;

			for(i = 0; i < ran_len; i++){
				char ch = ransomNote.charAt(i);
				for(j = 0; j<mag_len; j++){
					if(ch == magazine.charAt(j) && visited[j] == 0){
						visited[j] = 1;
						break;
					}
				}
				if(j == mag_len)
					break;
			}
			if(i != ran_len)
				System.out.println("Not possible");
			else
				System.out.println("Possible");
		}
	}
}