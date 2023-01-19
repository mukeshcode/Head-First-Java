class DotComTestDrive{
	public static void main(String[] args){
		DotCom dot = new DotCom();
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		System.out.println(locations[0] + " " + locations[1] + " " + locations[2]);
				
	
	}
}

class DotCom{
	private int[] locationCells;
	private int numberHits;

	public void setLocationCells(int[] locationCells){
		this.locationCells = locationCells;
		this.locationCells[0] = 10;
		this.locationCells[1] = 9;
		this.locationCells[2] = 8;
	}
}