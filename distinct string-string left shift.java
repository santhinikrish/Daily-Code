/*
Example Input/Output 1:
Input: abab
Output: 2
Explanation:
The possible combinations when shifting the alphabets in abab to the left are baba, abab, baba and abab.
Here the distinct strings are baba and abab.
So the count 2 is printed as the output.

Example Input/Output 2:
Input: aSasa
Output: 5

Example Input/Output 3:
Input: AABBAAABBA
Output: 5
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s[]=sc.next();
        Set<String> set=new HashSet<String>();
        for(int i=0;i<s.length();i++){
            String a=s.substring(1)+s.charAt(0);
            set.add(a);
            s=a;
        }
        System.out.print(set.size());
	}
}
