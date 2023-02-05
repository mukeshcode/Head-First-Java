import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        for(int i = 1; i<=n; i++){
            String str = "";
            if(i%3 ==  0)
                str += "Fizz";
            else if(i%5 == 0)
                str += "Buzz";
            else
                str += Integer.toString(i);
            answer.add(str);
        }
        return answer;
    }
}

public class FizzBuzz{
	public static void main(String[] args){
		Solution obj = new Solution();
		System.out.println(obj.fizzBuzz(5));
	}
}	