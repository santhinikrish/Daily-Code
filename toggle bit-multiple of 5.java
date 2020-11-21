/*
Example Input/Output 1:
Input: 1101
Output: Yes
Explanation:
The given binary representation is 1101.
The decimal equivalent of 1101 is N = 13.
All possible binary representations of 13 by toggling exactly one bit are given below.
0101 - 5
1001 - 9
1111 - 15
1100 - 12
The integers 5 and 15 are the multiples of 5.
So Yes is printed as the output.

Example Input/Output 2:
Input: 1010
Output: No
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            char d[]=s.toCharArray();
            d[i]=(d[i]=='1') ? '0' : '1';
            if((Integer.parseInt(new String(d),2))%5==0){
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
	}
}
