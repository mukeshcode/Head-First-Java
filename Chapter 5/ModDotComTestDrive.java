import java.io.*;
public class ModDotComTestDrive{
	public static void main(String[] args){
		int numOfGuesses = 0;
		ModDotCom dot = new ModDotCom();
		GameHelper helper = new GameHelper();

		int cell = (int)(Math.random() * 5);
		int locationCells[] = {cell, cell+1, cell+2};

		dot.setLocations(locationCells);

		boolean isAlive = true;
		while(isAlive){
			String guess = helper.getUserInput("Enter your guess : ");
			numOfGuesses++;
			String result = dot.checkYourself(guess);
			
			System.out.println(result);
			if(result.equals("kill")){
				System.out.println("You sunk the dotcom");
				System.out.println("in " + numOfGuesses + " no. of guesses.");
				isAlive = false;
			}
		}
	}
}

class ModDotCom{
	private int [] locationCells;
	private int numOfHits = 0;

	public void setLocations(int [] locs){
			this.locationCells = locs;
	}
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cells : locationCells){
			if(guess == cells){
				result = "hit";
				numOfHits++;
				if(numOfHits == 3)
					result = "kill";
			}
		}
		return result;
	}
}

class GameHelper{
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.println(prompt + " ");
		try{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0) return null;
		}catch(IOException e){
			System.out.println("IOException : " + e);
		}
		return inputLine;
	}
}