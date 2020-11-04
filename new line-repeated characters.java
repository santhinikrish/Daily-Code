/*
Example Input/Output 2:
Input: skillrack
Output:
skil
lrac
k
Explanation: Here S = skillrack.
The string S can be divided into three substrings as given below.
skil
lrac
k
The 5th character l is a repeated character.
The 9th character k is a repeated character.
Hence the output is skil lrac k

Example Input/Output 2:
Input: ENvironment
Output:
ENvironme
nt

Example Input/Output 3:
Input: abcdabcdefge
Output:
abcd
a
b
c
defg
e
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int f[]=new int[128];
        for(int i=0;i<s.length;i++){
            if(f[s[i]]>0) System.out.println();
            System.out.print(s[i]);
            f[s[i]]++;
        }
	   }
}   
