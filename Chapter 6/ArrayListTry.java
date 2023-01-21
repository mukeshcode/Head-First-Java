import java.util.*;

public class ArrayListTry{
	public static void main(String[] args){
		ArrayList<String> myList = new ArrayList<String>();
		
		String a = new String("Whoohoooo..");
		myList.add(a);

		String b = new String("Frog...");
		myList.add(b);

		int theSize = myList.size();
		System.out.println("Size : " + theSize);

		Object o = myList.get(0);
		System.out.println(o);		

		myList.remove(1);
		
		boolean isIn = myList.contains(b);
	}
}