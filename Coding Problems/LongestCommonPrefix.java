public class LongestCommonPrefix{
	public static void main(String[] args){
		boolean pass = true;
		String str2 = new String();
		int minLen = args[0].length();
		for(String str : args){
			if(minLen > str.length())
				minLen = str.length();
		}
		
		for(int i = 0; i<minLen; i++){
			for(int j = 0; j<args.length - 1; j++){
				if(args[j].charAt(i) != args[j+1].charAt(i)){
					pass = false;
					break;
				}
			}
			if(pass)
				str2 = args[0].substring(0, i+1);
			else
				break;
		}
		System.out.println(str2);
	}
} 