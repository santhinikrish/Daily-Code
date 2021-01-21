/*
Example Input/Output 1:
Input:
30 4
Output: 6
Explanation:
Here N = 30 and K = 4.
There are 6 integers from 1 to 30 having the sum of digits divisible by 4.
4 8 13 17 22 26
So 6 is printed as the output.

Example Input/Output 2:
Input:
100 10
Output: 9
Explanation:
Here N = 100 and K = 10.
There are 9 integers from 1 to 100 having the sum of digits divisible by 10.
19 28 37 46 55 64 73 82 91
So 9 is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),c=0;
        for(int i=1;i<=n;i++)
        {
            if(dup(i)%k==0) c++;
        }
        System.out.print(c);
	}
	public static int dup(int n)
  {
	    int sum=0;
	    while(n>0)
      {
	        sum+=(n%10);
	        n/=10;
	    }
	    return sum;
	}
}
