/**
Example Input/Output 1:
Input:
big
2 1 6
Output:
kpm
Explanation:
Here S = big.
The length of S is 3 and the three integers are 2, 1 and 6.
X = 2 -> After encrypting the first alphabet, the string becomes dig.
X = 1 -> After encrypting the first 2 alphabets, the string becomes ejg.
X = 6 -> After encrypting the first 3 alphabets, the string becomes kpm.
So kpm is printed as the output.

Example Input/Output 2:
Input:
SkillRack
8 7 6 5 3 2 1 4 9
Output:
LvmjeHopt
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        for(int i=0;i<s.length;i++)
        {
            int n=sc.nextInt();
            for(int j=0;j<i+1;j++)
            {
                s[j]=dup(s[j],n);
            }
        }
        System.out.print(new String(s));
	}
	public static char dup(char a,int n)
  {
	    while(n>0)
      {
	        if(a=='z'||a=='Z') a=(char)(a-26);
	        a++;
	        n--;
	    }
	    return a;
	}
}
