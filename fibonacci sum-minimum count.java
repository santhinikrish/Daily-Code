/*
Example Input/Output 1:
Input: 46
Output: 4
Explanation:
Here N = 46.
One of the possible ways to form the integer 46 by adding the integers present in the Fibonacci series is given below.
1 + 3 + 8 + 34 = 46.
The minimum number of integers required to form 46 is 4.
So 4 is printed as the output.

Example Input/Output 2:
Input: 100
Output: 3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
	 Scanner sc=new Scanner( System.in);
	 int n=sc.nextInt();
	 List<Integer> al=new ArrayList<>();
	 al.add(1);
	 int f=1,s=1;
	 while(s<n){
	     int t=f+s;
	     if(t<=n){
	     f=s;
	     s=t;
	     al.add(t);
	     }
	     else
	     s=n+1;
	 }
	 int c=0,sum=0;
	 for(int i=al.size()-1;i>=0;i--){
	     if(sum+al.get(i)<=n){
	         sum+=al.get(i);
	         c++;
	     }
	 }
	 System.out.println(c);
	}
}
