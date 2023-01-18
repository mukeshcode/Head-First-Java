class Driver{
	public static void main(String[] args){
		int a, b;
		myFunction(a=4, b=3);
		System.out.println("Value of a : " + a + ", Value of b : " + b);
	}

	static void myFunction(int a, int b){
		System.out.println("a : " + a + ", b : " + b);
	}
}