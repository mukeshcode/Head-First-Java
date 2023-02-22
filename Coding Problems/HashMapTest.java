import java.util.HashMap;
import java.util.*;

public class HashMapTest {
    public static void main(String[] args){
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap.put("GFG", 10);
        myHashMap.put("IDE", 15);
        myHashMap.put("Courses", 20);

        System.out.println(myHashMap);

        for(Map.Entry<String, Integer> e : myHashMap.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}
