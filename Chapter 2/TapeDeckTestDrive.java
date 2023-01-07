class TapeDeck{
	boolean canRecord = false;
	
	void playTape(){
		System.out.println("Tape is playing");
	}
	void recordTape(){
		System.out.println("Tape is recording");
	}
}

public class TapeDeckTestDrive{
	public static void main(String[] args){
		TapeDeck t = new TapeDeck(); // Creating an object of the class TapeDeck
		
		t.canRecord = true;
		t.playTape();

		if(t.canRecord == true)
			t.recordTape();

	}
}