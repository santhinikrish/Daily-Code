/*
Example Input/Output 1:
Input:
abcdefghijklmnopqrstuvwxyz
5
pen
gold
doll
coin
book
Output:
doll
Explanation:
Here N = 5.
The 5 words and their scores are given below.
pen - 35 (16+5+14)
gold - 38 (7+15+12+4)
doll - 43 (4+15+12+12)
coin - 41 (3+15+9+14)
book - 43 (2+15+15+11)
The words doll and book have the same maximum score, so the first occurring word doll is printed as the output.

Example Input/Output 2:
Input:
zyxwvutsrqponmlkjihgfedcba
4
pencil
horse
candle
cookie
Output:
candle
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int n=sc.nextInt(),m=0,o=0;
        String c[]=new String[n];
        for(int i=0;i<n;i++)
        {
            c[i]=sc.next();
            char a[]=c[i].toCharArray();
            int sum=0;
            for(int j=0;j<a.length;j++)
            {
                for(int k=0;k<26;k++)
                {
                    if(a[j]==s[k])
                    {
                        sum+=k+1;
                        break;
                    }
                }
            }
            if(sum>m)
            {
                m=sum;
                o=i;
            }
        }
        System.out.print(c[o]);
	}
}
