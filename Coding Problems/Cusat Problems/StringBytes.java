

public class StringBytes{
	public static void main(String[] args){
		String str = "1##2###3";
		byte[] arr = str.getBytes();
		for(byte bits : arr)
			System.out.println(bits);		
	}
}