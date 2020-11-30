/*
Example Input/Output 1:
Input:
4
45 4578 4005 90
Output:
186
Explanation:
Here N = 4. After dividing each integer into two equal halves, the integers become 4 5 45 78 40 5 9 0.
The sum of the 8 resulting integers is 186.
So 186 is printed as the output.

Example Input/Output 2:
Input:
5
157970 78 1000 99 500054
Output: 1724
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),sum=0L;
        for(int i=0;i<n;i++){
            char[] c=sc.next().toCharArray();
            sum+=Long.parseLong(new String(c).substring(0,c.length/2))+Long.parseLong(new String(c).substring(c.length/2));
        }
        System.out.print(sum);
	}
}
