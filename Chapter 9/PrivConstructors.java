public class PrivConstructors{
	public static void main(String[] args){
		MyClass obj = new MyClass();
	}
}

class MyClass{
	int studCount;

	private MyClass(){
		this.studCount = 45;
	}
}