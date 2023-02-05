import java.util.*;

class TwoRanges
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t;
		for(t = sc.nextInt(); t>0; t--){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    
		    int i, j, cnt = 0;
		    for(i = a, j = c; i<=b && j<=d;){
		        if(i < j){
		            i++; 
		            cnt++;
		        }
		        else if(i > j){
		            j++; 
		            cnt++;
		        }
		        else{
		            i++; 
		            j++; 
		            cnt++;
		        }
		    }
		    while(i <= b){
		        cnt++; i++;
		    }
		    while(j <= d){
		        cnt++; j++;
		    }
		    System.out.println(cnt);
		}
		
	}
}
