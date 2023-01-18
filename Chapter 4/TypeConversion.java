
class Driver{
	public static void main(String[] args){
		byte b = 10;
		float c = 12.21f;
		callMe(b);
		doubleCall(c);
	}
	public static void callMe(int num){
		System.out.println("value of num : " + num);
	}
	static void doubleCall(double value){
		System.out.println("Value of num : " + value);
	}
}
