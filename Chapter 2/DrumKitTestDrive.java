class DrumKit{
	boolean topHead = true;
	boolean snare = true;

	void playSnare(){
		System.out.println("Bang Bang ba-bang");
	}
	void playTopHat(){
		System.out.println("Ding Ding da-ding");
	}
}

class DrumKitTestDrive{
	public static void main(String[] args){
		DrumKit d = new DrumKit();
		
		if(d.snare == true)
			d.playSnare();
		d.snare = false;
		
		d.playTopHat();
	}
}