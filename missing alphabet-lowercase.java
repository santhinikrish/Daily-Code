/*
Example Input/Output 1:
Input:
skillrack
Output:
bdefghjmnopqtuvwxyz
Explanation:
The missing lower case alphabets in the string skillrack are b, d, e, f, g, h, j, m, n, o, p, q, t, u, v, w, x, y and z.
Hence the output is bdefghjmnopqtuvwxyz

Example Input/Output 2:
Input:
abcdeklmnouvwxyz
Output:
fghijpqrst
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        for(int i=1;i<=26;i++)
        {
            int p=0;
            for(int j=0;j<s.length;j++)
            {
                if(i==(int)(s[j]-96))
                {
                    p=1; break;
                }
            }
            if(p==0) System.out.print((char)(i+96));
        }
    }
}


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        ArrayList<Character> a=new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<26;j++)
            {
                if(s[i]==a.get(j))
                {
                    a.set(j,'*');
                    break;
                }
            }
        }
        for(char c:a)
        {
            if(c!='*')
            System.out.print(c);
        }
	}
}
