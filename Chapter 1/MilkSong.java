public class MilkSong{
	public static void main(String[] args){
		int milkNum = 99;
		String word = "bottles";

		while(milkNum > 0){
			if(milkNum == 1)
				word = "bottle";
			System.out.println(milkNum + " " + word + " of milk on the wall");
			System.out.println(milkNum + " " + word + " of milk.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			milkNum -= 1;

			if(milkNum == 0)
				System.out.println("No more bottles of milk on the wall.");
		}
	}
}