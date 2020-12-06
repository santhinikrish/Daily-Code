/*
Example Input/Output 1:
Input:
skillrack
k
Output:
skcarllik
Explanation:
The first occurrence and the last occurrence of the character k in the given string are highlighed below.
skillrack
After reversing the characters between them, the string becomes skcarllik.
So skcarllik is printed as the output.

Example Input/Output 2:
Input:
GoogleClassRoom#ForLearning
l
Output:
GooglCelassRoom#ForLearning
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=sc.next().charAt(0);
        int f=s.indexOf(c),l=s.lastIndexOf(c);
        StringBuilder sb=new StringBuilder(s.substring(f+1,l));
        System.out.print(s.substring(0,f+1)+""+sb.reverse().toString()+""+s.substring(l));
	  }
}
