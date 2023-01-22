import java.util.ArrayList;
public class SimpleDotComGame{
	public static void main(String[] args){
		SimpleDotCom dot = new SimpleDotCom();
	
		int firstLocation = (int)(Math.random() * 5);	// generate a number from 0 to 4.99 and cast it into  														// an integer
		ArrayList<String> locationCells = new ArrayList<String>();
		locationCells.add(Integer.toString(firstLocation));
		locationCells.add(Integer.toString(firstLocation+1));
		locationCells.add(Integer.toString(firstLocation+2));

		//System.out.println(locationCells);	// just for testing purpose

		dot.setLocationCells(locationCells);	// passing arraylist string as a param

		int numOfGuesses = 0;
		boolean isAlive = true;
		GameHelper helper = new GameHelper();// will help in taking input		
		while(isAlive){
			String guess = helper.getUserInput("Enter your Guess");
			numOfGuesses++;
			String result = dot.checkYourself(guess);
			if(result == "kill"){
				System.out.println("You killed the dot com!");
				System.out.println("You took " + numOfGuesses + " no. of guesses !");
				isAlive = false;
			}
		}

		
	}
}