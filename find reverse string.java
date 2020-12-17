/*
Example Input/Output 1:
Input:
SkaRllick
SkillRack
Output:
illRa
Explanation:
Here S1 = "SkaRllick" and S2 = "SkillRack" .
The substring illRa in S2 is reversed in S1.
So illRa is printed as the output.

Example Input/Output 2:
Input:
Encycloaidep
Encyclopedia
Output:
pedia
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                for(int j=a.length()-1;j>=0;j--)
                {
                    if(a.charAt(j)!=b.charAt(j))
                    {
                        System.out.print(b.substring(i,j+1));
                        return;
                    }
                }
           }
       }
	 }
}
