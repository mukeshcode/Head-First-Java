import java.util.Scanner;

public class TwoRanges2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int t = sc.nextInt(); t>0; t--){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int cnt;
			
			if(d<a || c>b)	// sets are disjoint
				cnt = (b-a+1) + (d-c+1);
			else{
				int leftExtreme = a<c ? a : c;
				int rightExtreme = b>d ? b : d;
				cnt = rightExtreme - leftExtreme + 1;
			}
			System.out.println(cnt);
		}		
	
	}
}