import java.util.*;

public class ArrayListMagnet{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add(0,"zero");
		al.add(1, "one");
		al.add(2, "two");
		al.add(3, "three");
		printAl(al);

		al.remove(2);
		if(al.contains("three"))
			al.add("four");
		printAl(al);

		if(al.indexOf("four") != 4)
			al.add(4, "4.2");

		printAl(al);
		printAl(al);	
	}
	
	public static void printAl(ArrayList<String> al){
		for(String str : al)
			System.out.print(str + " ");
		System.out.println();
	}
}