/*
Example Input/Output 1:
Input:
10 7
1 1 1 1 1 0 0
0 0 0 1 1 1 1
1 1 1 0 1 1 0
1 1 0 1 1 0 1
0 0 0 0 0 0 0
1 0 1 1 0 1 0
0 0 1 0 1 1 1
1 0 0 0 0 0 0
1 1 0 1 0 0 0
1 1 0 1 0 0 1
Output: 6
Explanation:
The longest empty coaches in the train are highlighted below.
1 1 1 1 1 0 0
0 0 0 1 1 1 1
1 1 1 0 1 1 0
1 1 0 1 1 0 1
0 0 0 0 0 0 0
1 0 1 1 0 1 0
0 0 1 0 1 1 1
1 0 0 0 0 0 0
1 1 0 1 0 0 0
1 1 0 1 0 0 1
Here the length is 6 which is printed as the output.

Example Input/Output 2:
Input:
5 6
0 0 0 1 0 1
1 0 0 1 0 1
1 0 0 0 0 1
0 0 0 1 0 1
0 0 1 1 1 0
Output: 11
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        int c=0,max=0;
        String s="";
        for(int i=0;i<m;i++)
        {
            for(int j=0,k=n-1;j<n;j++,k--)
            {
                if(i%2==0)  s+=a[j][i]+"";
                else  s+=a[k][i]+"";
            }
        }
        for(int i=0;i<s.length();i++){
            c=0;
            if(s.charAt(i)=='0')
            {
                c++;
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)=='0')  c++;
                    else  break;
                }
            }
            if(c>max) max=c;
        }
        System.out.println(max);
	}
}
