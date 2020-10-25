/*
Example Input/Output 1:
Input: 322
Output: 299
Explanation: Here N = 322.
The largest integer is 299, which is less than or equal to 322 and also the digits in 299 are sorted in increasing order.
So 299 is printed as the output.

Example Input/Output 2:
Input: 1234
Output: 1234
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long n=Long.parseLong(s);
        for(long i=n;i>0;i--){
            char[] c=Long.toString(i).toCharArray();
            Arrays.sort(c);
            if(new String(c).equals(a)){
                System.out.print(a);
                return;
            }
        }
	  }
}
