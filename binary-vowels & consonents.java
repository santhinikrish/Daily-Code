/*
Example Input/Output 1:
Input: 528
Output: baeiocuaei
Explanation:
Here N=528, the binary representation of 528 is 1000010000.
After replacing 0s with the lower case vowels circularly in alphabetical order, the string becomes 1aeio1uaei.
After replacing 1s with the lower case consonants circularly in alphabetical order, the string becomes baeiocuaei.
So baeiocuaei is printed as the output.

Example Input/Output 2:
Input: 50
Output: bcaedi
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),a=Long.toBinaryString(Long.parseLong(s));
        char b[]=a.toCharArray(),c[]=new char[]{'a','e','i','o','u'},d='a';
        int k=0;
        for(int i=0;i<a.length();i++)
        {
            if(b[i]=='0'){
                if(k==5) k=0;
                b[i]=c[k++];
            }else{
                d++;
                if(d=='e'||d=='i'||d=='o'||d=='u') d++;
                b[i]=d;
                if(d=='z') d='a';
            }
        }
        System.out.print(b);
	}
}
