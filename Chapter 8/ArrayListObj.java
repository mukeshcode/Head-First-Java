import java.util.ArrayList;

public class ArrayListObj{
	public static void main(String[] args){
		ArrayList<Object> myList = new ArrayList<Object>();
		String[] myStrings = {"Sita", "Rama"};
		myList.add(5);
		myList.add("5");
		myList.add(myStrings[0]);
		myList.add(myStrings[1]);
	
		System.out.println(myList);
	}
}