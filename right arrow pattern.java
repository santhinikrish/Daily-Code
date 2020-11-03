/*
Example Input/Output 1:
Input:
5
Output:
--*
---*
*****
---*
--*
Explanation: Here N = 5.
The 1st line contains (5-1)/2 hyphens and an asterisk.
--*
The 2nd line contains (5-1)/2 + 1 hyphens and an asterisk.
---* The 3rd line contains 5 asterisks.
*****
The 4th line contains (5-2) hyphens and an asterisk.
---*
The 5th line contains (5-3) hyphens and an asterisk.
--*

Example Input/Output 2:
Input:
7
Output:
---*
----*
-----*
*******
-----*
----*
---*
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=(n-1)/2,g=0;
        String s[]=new String[n];
        for(int i=0;i<n/2;i++){
            String d="";
            for(int j=0;j<k;j++){
                d+='-';
                System.out.print("-");
            }
            s[g++]=d+"*";
            System.out.print("*"+"\n");
            k++;
        }
        for(int i=0;i<n;i++) System.out.print("*");
        System.out.println();
        for(int i=g-1;i>=0;i--){
            System.out.println(s[i]);
        }
	}
}
