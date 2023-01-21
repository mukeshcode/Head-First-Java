import java.util.*;
import java.io.*;
public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<String> myList = new ArrayList<String>();
		System.out.println("ArrayList empty : " + myList.isEmpty());
		
		ScannerHelper sc = new ScannerHelper();
		
		String element = sc.getUserInput("Enter 1st string");
		myList.add(element);
		
		System.out.println(myList);
		
		element = sc.getUserInput("Enter 2nd string");
		myList.add(element);

		System.out.println(myList);

		String srch = sc.getUserInput("Search an element");
		System.out.println("The arraylist contains " + srch + " : " + myList.contains(srch));

		String rm = sc.getUserInput("Enter string to remove");
		System.out.println(myList.remove(rm));

		int index = Integer.parseInt(sc.getUserInput("Enter the index"));
		System.out.println("Element removed : " + myList.remove(index));

		//You can use myList.get(index) to get the element at the index position.
	}
}

class ScannerHelper{
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.print(prompt + ": ");
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			inputLine = in.readLine();
			if(inputLine.length() == 0) return null;
		}catch(IOException e){
			System.out.println("IOException : " + e);
		}
		return inputLine;
	}
}