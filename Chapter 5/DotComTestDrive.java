public class DotComTestDrive{
	public static void main(String[] args){
		DotCom dot = new DotCom();
		int[] locations = {2, 3, 4};
		dot.setLocations(locations);
		
		String guess = "2";
		dot.makeGuess(guess);
	}
}

class DotCom{
	private int[] locationCells;
	private int numberHits = 0;

	
	public void setLocations(int[] locations){
		this.locationCells = locations;
	}

	public void makeGuess(String guess){
		int myGuess = Integer.parseInt(guess);
		String result = "Miss";
		for(int cells : this.locationCells){
			if(cells == myGuess){
				numberHits++;
				result = "Hit";
				break;
			}
		}
		if(numberHits == this.locationsCells.length)
			result = "Kill";

		System.out.println(result);
	}
}