public class Tester{
	public static void main(String[] args){
		// Try to make object of the class in the same folder
		Class1 obj1 = new Class1();
		obj1.say();
		
		// Try to make object of the class in the different folder
		Class2 obj2 = new Class2();
		obj2.say();
	}
}