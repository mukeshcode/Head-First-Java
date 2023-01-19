import java.lang.*;
import java.util.Scanner;


class CheckerMachine{
	private String myString;

	void setString(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string : ");
		this.myString = sc.nextLine();
	}
	String getString(){
		return this.myString;
	}
	boolean isAPallindrome(){
		int length = this.myString.length();
		//System.out.println("Length of the string : " + length);
		for(int i = 0, j = length-1; i<j; i++,j--)
			if(this.myString.charAt(i) != this.myString.charAt(j))	
				return false;
		return true;
	}
}


class Driver{
	public static void main(String[] args){
		CheckerMachine myMachine = new CheckerMachine();
		myMachine.setString();
		System.out.println("Value of myString : " + myMachine.getString());
		System.out.println(myMachine.getString() + " is a Pallindrome : "+myMachine.isAPallindrome());
	}
}