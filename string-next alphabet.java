/*
Example Input/Output 1:
Input:
4
2 1 3 5
abcde
Output: eeeef
Explanation: Here S = abcde.
The 1st integer is 2, so the first 2 alphabets in the string abcde are replaced with their next alphabet b and c.
Now the string becomes bccde.
The 2nd integer is 1, so the first alphabet in the string bccde is replaced with its next alphabet c.
Now the string becomes cccde.
The 3rd integer is 3, so the first 3 alphabets in the string cccde are replaced with their next alphabet d, d and d.
Now the string becomes dddde.
The 4th integer is 5, so the first 5 alphabets in the string dddde are replaced with their next alphabets e, e, e, e and f.
Now the string becomes eeeef.
So eeeef is printed as the output.

Example Input/Output 2:
Input:
3
2 1 3
ZEBRA
Output: CGCRA
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        char s[]=sc.next().toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<a[i];j++){
                if(s[j]=='Z') s[j]='A';
                else if(s[j]=='z') s[j]='a';
                else s[j]++;
            }
        }
        System.out.print(s);
	  }
}
