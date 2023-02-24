import java.util.*;

class Solution{
    public boolean solution(String s, String t){
        int i, j;
        for(i = 0, j = 0; i<s.length() && j<t.length();){
            if(s.charAt(i) == t.charAt(j)){
                i++; j++;
            }
            else 
                j++;
        }
        if(i == s.length())
            return true;
        return false;
    }
}

public class SubsequenceTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // System.out.println(s1.charAt(3));


        Solution sol = new Solution();

        boolean isSubsequence = sol.solution(s1, s2);
        System.out.println("A subsequence : " + isSubsequence);
    }
}