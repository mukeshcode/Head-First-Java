public class Try{
	public static void main(String[] args){
		Num n1 = new Num();
		
 		Num n2 = n1;

		n1.setNum(750);

		n1 = new Num();
		n1.setNum(50);

		System.out.println("Value of n1 : " + n1.n);
		System.out.println("Value of n2 : " + n2.n);
		

		//Similarly testing in strings
		String name1 = "Rama";
		String name2 = name1;

		name2 = "Krishna";
		
		System.out.println("Name 1 : " + name1);
		System.out.println("Name 2 : " + name2);
		
	}
}

class Num{
	int n;

	void setNum(int number){
		n = number;
	}
} 