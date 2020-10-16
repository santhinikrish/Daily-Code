/*
Example Input/Output 1:
Input:
boom
Output:
bo**
**om
Explanation:
Here S = boom and its length is 4.
S1 = boom S2 = ****
The 1st alphabet in S is b and there is no previous alphabet. So there is no change in S1 and S2.
The 2nd alphabet in S is o and the previous alphabet is a consonant (b). So there is no change in S1 and S2.
The 3rd alphabet in S is o and the previous alphabet is a vowel (o). So the characters in S1 and S2 are interchanged in the same position.
S1 = bo*m
S2 = **o*
The 4th alphabet in S is m and the previous alphabet is a vowel (o). So the characters in S1 and S2 are interchanged in the same position.
S1 = bo**
S2 = **om
Hence the output is
bo**
**om

Example Input/Output 2:
Input:
skillrack
Output:
ski*lra*k
***l***c*

Example Input/Output 3:
Input:
QUEUEING
Output:
QU*****G
**EUEIN*
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char s[]=str.toCharArray();
        char a[]=str.toCharArray();
        char b[]=new char[s.length];
        for(int i=0;i<s.length;i++) b[i]='*';
        for(int i=1;i<s.length;i++){
            char d=Character.toLowerCase(s[i-1]);
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'){
                char r=b[i];
                b[i]=a[i];
                a[i]=r;
            }
        }
        System.out.print(new String(a)+"\n"+new String(b));
	 }
}
