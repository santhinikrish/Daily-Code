/*
Example Input/Output 1:
Input:
101
2 3
Output: 0
Explanation: Here R = 2 and N = 3.
The first character is 1, so 0 is inserted after 1.
The second character is 0, so 1 is inserted after 0.
Now the string becomes 10011.
The 3rd character in the above string is 0, which is printed as the output.

Example Input/Output 2:
Input:
11
1 3
Output: 1

Example Input/Output 3: 
Input:
11011
5 10
Output: 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int r=sc.nextInt(),n=sc.nextInt();
        String a="";
        int c=0;
        for(int i=0;i<s.length;i++){
            c++;
            if(c>r)
                a+=s[i];
            else{
                a+=s[i];
                if(s[i]=='1')
                a+=0;
                else
                a+=1;
            }
        }
        System.out.print(a.charAt(n-1));
	  }
}
