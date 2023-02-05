public class DuckTest{
	public static void main(String[] args){
		Duck myDuck = new Duck(20, "Twenty");
		Duck myDuck2 = new Duck("Thirty", 30);
	}
}

class Duck{
	private int size;
	private String name;
	
	Duck(int size, String name){
		this.size = size;
		this.name = name;
		System.out.println("Size and name");
	}

	Duck(String name, int size){
		this.size = size;
		this.name = name;
		System.out.println("Name and size");
	}
	void printSize(){System.out.println("Size of the duck : " + this.size);}
}