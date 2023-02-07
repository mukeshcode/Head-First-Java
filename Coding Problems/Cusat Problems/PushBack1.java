import java.io.PushbackInputStream;

public class PushBack1{
	public static void main(String[] args){
		PushbackInputStream push1 = new PushbackInputStream(System.in);
		char ch = 'a';
		while(true){
			try{
				ch = (char)push1.read();
			}catch(Exception e){
				System.out.println(e);
			}
			if(ch == '\n')
				System.exit(0);
			else
				System.out.println(ch);
		}
	}
}