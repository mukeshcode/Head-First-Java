import java.util.*;
public class ArrayListIndex{
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rama");
		names.add("Krishna");
		names.add(0, "Sita");
		names.add(3, "Radha");
		names.add(4, "Madhava");
		names.add(0, "Keshava");
		System.out.println(names);
	}
}