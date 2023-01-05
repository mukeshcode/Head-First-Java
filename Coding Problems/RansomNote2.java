import java.util.Scanner;

public class RansomNote2{
	public static void main(String[] args){
		String ransomNote, magazine;
		int[] alphabets = new int[26];			// as there are 26 letters
		boolean possible = true;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter RansomNote : ");
		ransomNote = sc.next();
		System.out.print("Enter magazine   : ");
		magazine = sc.next();

		if(ransomNote.length() > magazine.length())
			possible = false;
		else{
			for(int i = 0; i < magazine.length(); i++)
				alphabets[magazine.charAt(i) - 'a']++;

			for(int i = 0; i < ransomNote.length(); i++){
				if(alphabets[ransomNote.charAt(i) - 'a'] == 0){
					possible = false;
					break;
				}
				alphabets[ransomNote.charAt(i) - 'a']--;
			}
		}

		if(possible)
			System.out.println("Possible");
		else
			System.out.println("Not possible");
		
	}
}