public class Test{
	public static void main(String[] args){
		for(int i = 0; i<4; i++){
			Num n = new Num();
			n.num += 1;
			System.out.println(n.num);			
		}
	}
}

class Num{
	int num = 1;
}