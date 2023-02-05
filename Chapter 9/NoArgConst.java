public class NoArgConst{
	public static void main(String[] args){
		Furniture chair = new Furniture();
		System.out.println("It worked ! ");
	}
}

class Furniture{
	int cnt;
	Furniture(int cnt){
		this.cnt = cnt;
	}
}