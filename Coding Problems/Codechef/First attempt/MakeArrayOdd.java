/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeArrayOdd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int t = sc.nextInt(); t>0; t--){
		    int n, x; 
		    n = sc.nextInt();
		    x = sc.nextInt();
		    int[] A = new int[n];
		    for(int i = 0; i<n; i++)
		        A[i] = sc.nextInt();
		    
		    int evenCnt = 0;
		    for(int i = 0; i<n; i++)
		        if(A[i]%2 == 0) evenCnt++;
		        
		    if(x%2 == 1){
		        if(evenCnt%2 == 0)
		            System.out.println(evenCnt/2);
		        else
		            System.out.println(-1);
		    }
		    else{
		        if(evenCnt < n)
		            System.out.println(evenCnt);
		        else
		            System.out.println(-1);
		    }
		}
	}
}
