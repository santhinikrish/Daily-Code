/*
Input:
boys
6
all the boys are too lazy
Output:
-1
-1
0 3
-1
-1
-1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
		    String t=scan.next();
		    if(s.contains(t))
		    {
		        int l=s.indexOf(t)+t.length()-1;
		        System.out.println(s.indexOf(t)+" "+l);
		    }
		    else
		    System.out.println(-1);
		}
	}
}
