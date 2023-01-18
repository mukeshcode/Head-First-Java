class LocalVariables{
	int num;

	void print(){
		System.out.println("Number : " + this.num);
	}

	public static void main(String[] args){
		int x;
		LocalVariables lv = new LocalVariables();
		lv.print();
		System.out.println("Value of x : " + x);
	}
}