/*
Example Input/Output 1:
Input: 53
Output: 58
Explanation:
The binary representation of 53 is 110101.
After shifting the bits to the left by 1 position in the binary representation of 53, the binary representation becomes 101011.
The decimal equivalent of 101011 is 43.
Similarly, the remaining possible binary representations and their decimal equivalents are given below.
010111 - 23
101110 - 46
011101 - 29
111010 - 58
110101 - 53
Here the largest integer is 58.
So it is printed as the output.

Example Input/Output 2:
Input: 16
Output: 16
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        char[] s=Long.toBinaryString(n).toCharArray();
        int l=s.length,ans=0;
        for(int i=0;i<l;i++){
            String dup="";
            for(int j=i;j<i+l;j++){
                dup+=s[j%l];
            }
            int m=Integer.parseInt(dup,2);
            ans=Math.max(m,ans);
        }
        System.out.print(ans);
	}
}
