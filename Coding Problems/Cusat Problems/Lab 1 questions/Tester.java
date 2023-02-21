import java.util.*;

public class Tester {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        list.remove(Integer.valueOf(40));
        System.out.println("Type of : " + Integer.valueOf(50).getClass().getSimpleName());
        System.out.print(50 instanceof Integer);
        System.out.println(list);
 
    }    
}
