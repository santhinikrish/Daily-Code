/*
Example Input/Output 1:
Input:
5
9408 80 331 10455 900
Output: 2116
Explanation:
The smallest integer among the 5 integers is 80.
The number of digits in 80 is 2.
After removing the last digit (2 - 1 = 1) in each integer, the integers become 940, 8, 33, 1045 and 90.
The sum of the 5 modified integers is 2116 which is printed as the output.

Example Input/Output 2:
Input:
2
1264 9987
Output:
10
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n],min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            min=Math.min(min,a[i]);
        }
        int l=(Integer.toString(min)).length(),sum=0;
        for(int i=0;i<n;i++)
        {
            String s=(Integer.toString(a[i]));
            sum+=Integer.parseInt(s.substring(0,s.length()-l+1));
        }
        System.out.print(sum);
	}
}
