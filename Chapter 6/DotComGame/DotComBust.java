import java.util.*;

public class DotComBust{
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		this.dotComsList.add(one);
		this.dotComsList.add(two);
		this.dotComsList.add(three);

		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, etoys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest no. of guesses.");

		for(DotCom dotComToSet : dotComsList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}


	private void startPlaying(){
		while(!dotComsList.isEmpty()){
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}


	private void checkUserGuess(String userGuess){
		this.numOfGuesses++;
		String result = "miss";

		for(DotCom dotComToTest : dotComsList){
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("hit"))
				break;
			if(result.equals("kill")){
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}


	private void finishGame(){
		System.out.println("All Dot Coms are dead ! Your stock is now worthless.");
		if(this.numOfGuesses <= 18){
			System.out.println("It only took you " + this.numOfGuesses);
			System.out.println("You got out before your options sank ! ");
		} else {
			System.out.println("Took you long enough. " + this.numOfGuesses + "guesses.");
			System.out.println("Fishes are dancing with your options.");
		}
	}


	public static void main(String[] args){
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}