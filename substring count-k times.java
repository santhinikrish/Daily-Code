/*
Example Input/Output 1:
Input:
abcccc
1 4
Output: YES
Explanation:
Here S = abcccc, L = 1 and K = 4.
The substring values of length 1 are a, b, c, c, c, c.
The substring c has repeated 4 times consecutively.
So YES is printed as the output.

Example Input/Output 2:
Input:
ababaaac
2 2
Output: YES

Example Input/Output 3:
Input:
xyxyxzxy
2 3
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int l = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;i<=str.length()-l;i++)
		{
		    String substr = str.substring(i,i+l);
		    String check = substr.repeat(k);
		    if(str.contains(check))
		    {
		        System.out.print("YES");
		        System.exit(0);
		    }
		}
		System.out.print("NO");
	}
}
