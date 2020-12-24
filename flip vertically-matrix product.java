/*
Example Input/Output 1:
Input:
3 3
1 3 5
8 26 7
25 36 2

5 6 31
6 47 40
3 10 7
Output:
3 30 35
48 1222 280
125 216 62
Explanation:
After flipping the matrix M2 vertically, the matrix becomes
3 10 7
6 47 40
5 6 31
The product of the two matrices M1 and M2 is given below.
3 30 35
48 1222 280
125 216 62

Example Input/Output 2:
Input:
4 3
24 82 57
34 16 75
59 64 57
72 85 16

45 89 30
67 71 37
45 16 27
17 74 15
Output:
408 6068 855
1530 256 2025
3953 4544 2109
3240 7565 480
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        b[i][j]=sc.nextInt();
        for(int i=0,k=n-1;i<n && k>=0;i++,k--,System.out.println())
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]*b[k][j]+" ");
            }
        }
	  }
}
