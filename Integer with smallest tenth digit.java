/*
Example Input/Output 1:
Input:
5
89 12 63 52 14
Output:
12 14
Explanation:
Here N = 5, the given 5 integers are 89, 12, 63, 52 and 14.
The smallest tenth digit among the tenth digits of the given 5 integers is 1.
The integers having the tenth digit as 1 are 12 and 14.
So they are printed as the output.

Example Input/Output 2:
Input:
8
79 78603 6215 407 819 7308 202 100
Output: 78603 407 7308 202 100
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=Integer.MAX_VALUE;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int  m=(a[i]/10)%10;
            if(m<max) max=m;
        }
        for(int i=0;i<n;i++){
            if(max==(a[i]/10)%10)
                System.out.print(a[i]+" ");
        }
	  }
}
