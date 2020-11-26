/*
Example Input/Output 1:
Input: abcbca
Output: 7
Explanation:
Here S = "abcbca" .
There are 7 substrings containing at least one occurrence of all three alphabets a, b and c.
abc
abcb
abcbc
abcbca
bcbca
cbca
bca
So 7 is printed as the output.

Example Input/Output 2:
Input: aaabcccc
Output: 12
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),r="abc",a="",g="";int c=0;
        Set<Character> l=new TreeSet<Character>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                g="";a=s.substring(i,j+1);
                for(int k=0;k<a.length();k++)
                l.add(a.charAt(k));
                for(char k:l) g+=k;
                if(r.equals(g)) c++;
            }
            l.clear();
        }
        System.out.print(c);
	}
}
