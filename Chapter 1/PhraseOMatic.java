public class PhraseOMatic{
	public static void main(String[] args){
		String[] listOne = {"single", "win-win", "smart", "multi-tier"};
		String[] listTwo = {"cracking", "mind-blowing", "sweet and simple", "radical", "out-of-the-box"};
		String[] listThree = {"design", "idea", "plan", "mindset", "vision"};
		int oneLength = listOne.length;
		int twoLength = listTwo.length;
		int threeLength = listThree.length;

		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);

		String phrase = listOne[rand1] + " " + listTwo[rand2] + " " + listThree[rand3];
		System.out.println("All we need is a " + phrase + ".");
	}
}