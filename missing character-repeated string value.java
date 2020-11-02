/*
Example Input/Output 1:
Input:
ant
antantantanantantant
Output: t
Explanation:
Here S1 = ant and S2 = antantantanantantant.
The missing character in S2 is t.
So t is printed as the output.

Example Input/Output 2:
Input:
OrAclE
OrAclEOrAclEOrAclEOrAclEOrclE
Output: A
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next()+" ";
        int f=b.length()/a.length();
        for(int i=0;i<f;i++) a+=a;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                System.out.print(a.charAt(i));
                return;
            }
        }
	}
}
