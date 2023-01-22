import java.io.*;
public class GameHelper{
	public String getUserInput(String prompt){
		String readLine = null;

		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.print(prompt + " : ");
			readLine = reader.readLine();
			if(readLine.length() == 0) return null;
		}catch(IOException e){
			System.out.println("IO Exception : " + e);
		}
		return readLine;
	}
}