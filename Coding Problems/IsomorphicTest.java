import java.util.*;

class Solution{
    public boolean isIsomorphic(String s, String t){
        // if(s.length() != t.length())
        //     return false;
        
        // HashMap<Character, Character> h = new HashMap<Character, Character>(s.length());

        // for(int i = 0; i<s.length(); i++){
        //     if(h.containsKey(s.charAt(i))){
        //         if(h.get(s.charAt(i)) != t.charAt(i))
        //             return false;
        //     }
        //     else if(h.containsValue(t.charAt(i)))
        //             return false;
        //     else
        //         h.put(s.charAt(i), t.charAt(i));
        // }

        // return true;

        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        System.out.println("Length : " + n);
        for (int i=0; i<n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]){
                System.out.println("Returning false : " + m1[s.charAt(i)] + " , " + m2[t.charAt(i)]);
                return false;
            }
            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }
        return true;

    }
}

public class IsomorphicTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.print("Enter first string : ");
        String str1 = sc.next();
        System.out.print("Enter second string : ");
        String str2 = sc.next();

        System.out.println("Strings are isomorphic : " + s.isIsomorphic(str1, str2));
    }
}
