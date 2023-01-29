import java.util.Scanner;

public class DistinctCharTest{
	public static void main(String[] args){
		StringBox strB1 = new StringBox();

		strB1.setString();
		//System.out.println("Given string : " + strB1.getString());

		strB1.printDistinct();
	}
}

class StringBox{
	private String myString;

	public void setString(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		this.myString = sc.nextLine();
	}
	public String getString(){ return this.myString; }

	public void printDistinct(){
		System.out.println("String length : " + this.myString.length());
		for(int i = 0; i<this.myString.length(); i++){
			boolean duplicate = false;
			for(int j = 0; j<i; j++){
				if(this.myString.charAt(j) == this.myString.charAt(i))
					duplicate = true;
			}
			if(!duplicate)
				System.out.print(this.myString.charAt(i) + ", ");
		}
	}
}