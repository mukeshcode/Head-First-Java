import java.util.HashSet;
import java.util.Iterator;

class Solution {
}

public class Tester {
    public static void main(String[] args){
        HashSet<String> myHash = new HashSet<String>();

        myHash.add("Rama");
        myHash.add("Krishna");
        myHash.add("Hari");

        System.out.println("Size of myHash : " + myHash.size());
        myHash.remove("Rama");
        System.out.println(myHash);
 
        Iterator<String> i = myHash.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }

        myHash.clear();
        System.out.println("\n" + myHash);
    }
}