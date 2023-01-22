import java.util.ArrayList;
public class SimpleDotCom{
	private ArrayList<String> locationCells = new ArrayList<String>();

	public void setLocationCells(ArrayList<String> loc){
		this.locationCells = loc;
	}
	public String checkYourself(String userInput){
		String result = "miss";

		int index = this.locationCells.indexOf(userInput);

		if(index >= 0){
			result = "hit";
			this.locationCells.remove(index);
			if(this.locationCells.isEmpty()){
				System.out.println(result);
				result = "kill";
				
			}
		}
		System.out.println(result);
		return result;
	}
	
}