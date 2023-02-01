import java.util.Scanner;

public class ZeroString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = new String();

		int zeroCnt, oneCnt;
		zeroCnt = oneCnt = 0;
		int n = sc.next;
		s = sc.next();
		for(int i = 0; i<n; i++){
			if(s.charAt(i) == '0')
				zeroCnt++;
			else
				oneCnt++;
		}
		if(oneCnt > zeroCnt)
			System.out.println(zeroCnt + 1);
		else
			System.out.println(oneCnt);
	}
}