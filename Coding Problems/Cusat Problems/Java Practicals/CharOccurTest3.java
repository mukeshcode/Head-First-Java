// 3. Count the occurrences of each character
import java.util.Scanner;

public class CharOccurTest3{
	public static void main(String[] args){
		StringBox strB1 = new StringBox();
		strB1.setString();
		//System.out.println("Your string : " + strB1.getString());	
		strB1.countOccurences();
	}
}

class StringBox{
	private String myString;

	public void setString(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Feed String : ");
		this.myString = sc.nextLine();
	}

	public String getString(){return this.myString;}

	public void countOccurences(){
		for(int i = 0; i<this.myString.length() ; i++){
			boolean alreadyVisited = false;
			for(int j = i-1; j>=0; j--){
				if(this.myString.charAt(j) == this.myString.charAt(i)){
					alreadyVisited = true;
					break;
				}
			}
			if(!alreadyVisited){
				int count = 1;
				for(int k = i+1; k<this.myString.length(); k++){
					if(this.myString.charAt(i) == this.myString.charAt(k))
						count++;
				}
				System.out.println(this.myString.charAt(i) + " : " + count);
			}
			
		}
	}
}