/*
Example Input/Output 1:
Input:
note
ball
Output:
nabotlle
Explanation:
S1 = note S2 = ball
The characters from both S1 and S2 are printed as per the given order.
Hence the output is nabotlle

Example Input/Output 2:
Input:
abc123
456@xy
Output:
a54bc@612yx3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s1[]=sc.next().toCharArray();
        char s2[]=sc.next().toCharArray();
        for(int i=0;i<s1.length;i+=2){
            System.out.print(s1[i]+""+s2[i+1]+""+s2[i]+""+s1[i+1]);
        }
	}
}
