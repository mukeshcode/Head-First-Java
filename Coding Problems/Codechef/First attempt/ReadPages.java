/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ReadPages
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int N, X, Y;
		    N = sc.nextInt();
		    X = sc.nextInt();
		    Y = sc.nextInt();
		    
		    if(X*Y < N)
		        System.out.println("NO");
		    else
		        System.out.println("YES");
			t--;
		}
	}
}
