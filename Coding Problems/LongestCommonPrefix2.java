public class LongestCommonPrefix2{
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.println("Result : " + sol.solve(args));
	}
}

class Solution{
	String solve(String[] strs){
		if(strs.length == 0) return "";
		if(strs.length == 1) return strs[0];
       	int i = 0;
       	char ch = '0';
       	while(true){
     		for(String str : strs){
				if(i >= str.length()) return str;
				if(ch == '0'){ch = str.charAt(i);}
				if(str.charAt(i) != ch) return str.substring(0, i);
            }
            i++;
            ch = '0';
        }
	}
}