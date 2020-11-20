/*
Example Input/Output 1:
Input:
Cream
JAM
Output: 4
Explanation:
After removing the first 3 characters from the string Cream, the string becomes am.
After removing the first character from the string JAM, the string becomes AM.
The revised string values am and AM are equal by ignoring the case.
The minimum number of characters to be removed from the left side of the given string values is 4 (3 + 1).
So 4 is printed as the output.

Example Input/Output 2:
Input:
corn
Corn
Output: 0

Example Input/Output 3:
Input:
123@abc
123@XYZ
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char[] a=sc.next().toCharArray();
        char[] b=sc.next().toCharArray();
        int k=0;
        for(int i=a.length-1,j=b.length-1;i>=0 && j>=0;i--,j--){
            a[i]=Character.toLowerCase(a[i]);
            b[j]=Character.toLowerCase(b[j]);
            if(a[i]==b[j])  k++;
            else  break;
            }
        }
        System.out.print((k==0) ? "-1" : (a.length+b.length)-(k*2));
	}
}
