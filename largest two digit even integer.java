/*
Example Input/Output 1:
Input: 147
Output: 74
Explanation:
Here N = 147, the possible two-digit integers are 14, 17, 41, 47, 71 and 74.
The largest two-digit even integer is 74.
So 74 is printed as the output.

Example Input/Output 2:
Input: 53813
Output: 58

Example Input/Output 3:
Input: 2406
Output: 64
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();int m=0;
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                String d="";
                d+=s[i]+""+s[j];
                StringBuilder sb=new StringBuilder(d);
                String a=sb.reverse().toString();
                if(Integer.parseInt(d)>m && Integer.parseInt(d)%2==0){
                   m=Integer.parseInt(d);
                }
                if(Integer.parseInt(a)>m && Integer.parseInt(a)%2==0){
                    m=Integer.parseInt(a);
                }
            }
        }
        System.out.print(m);
	}
}
