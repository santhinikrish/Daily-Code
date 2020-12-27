/*
Boundary Condition(s):
2 <= R, C <= 50
1 <= Number of fish in each pile <= 1000
1 <= W <= 100
1 <= X <= R

Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
The (R+2)nd line contains W.
The (R+3)rd line contains W integers separated by a space.

Output Format:
The first R lines, each contains C integers separated by a space.

Example Input/Output 1:
Input:
7 4
15 16 13 19
19 13 20 11
12 13 12 13
10 14 13 18
14 18 19 19
13 19 12 17
20 14 19 14
5
1 3 2 1 6
Output:
15 16 13 19
18 12 19 10
11 12 11 12
9 13 12 17
12 16 17 17
10 16 9 14
15 9 14 9
Explanation:
Here the number of waves is 5.
In the 1st wave, the nearest 1 row is affected. So the last row becomes
19 13 18 13
In the 2nd wave, the nearest 3 rows are affected. So the last 3 rows become
13 17 18 18
12 18 11 16
18 12 17 12
In the 3rd wave, the nearest 2 rows are affected. So the last 2 rows become
11 17 10 15
17 11 16 11
In the 4th wave, the nearest 1 row is affected. So the last row becomes
16 10 15 10
In the 5th wave, the nearest 6 rows are affected. So the last 6 rows become
18 12 19 10
11 12 11 12
9 13 12 17
12 16 17 17
10 16 9 14
15 9 14 9
Hence the output is
15 16 13 19
18 12 19 10
11 12 11 12
9 13 12 17
12 16 17 17
10 16 9 14
15 9 14 9

Example Input/Output 2:
Input:
3 3
9 6 6
5 6 5
6 5 9
10
3 3 3 3 3 3 3 3 3 3
Output:
0 0 0
0 0 0
0 0 0
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
        int l=sc.nextInt(),b[]=new int[l];
        for(int i=0;i<l;i++)
            b[i]=sc.nextInt();
        for(int i=0;i<l;i++)
        {
            for(int j=Math.abs(n-b[i]);j<n;j++)
            {
                for(int k=0;k<m;k++)
                {
                    a[j][k]--;
                }
            }
        }
        for(int i=0;i<n;i++,System.out.println())
        {
            for(int j=0;j<m;j++)
            {
                System.out.print((a[i][j]>=0) ? (a[i][j]+" ") : "0 ");
            }
        }
	}
}
