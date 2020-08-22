/*
Example Input/Output 1:
Input: 4
44 17 27 29
39 29 18 19
13 40 13 31
36 47 29 22
270
Output:
29 19 31 22
27 18 13 29
17 29 40 47
44 39 13 36
Explanation:
After rotating the matrix by 270 degrees, the matrix becomes.
29 19 31 22
27 18 13 29
17 29 40 47
44 39 13 36

Example Input/Output 2:
Input: 5
35 11 98 52 8
44 48 77 85 80
67 77 25 44 10
97 17 38 55 95
32 70 78 85 69
45
Output: INVALID
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		int[][]a=new int[n][n];
		int i,j;
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        a[i][j]=z.nextInt();
		    }
		}
		int angle=z.nextInt();
		if((angle%10)!=0 || (angle%9)!=0)
		{
		    System.out.print("INVALID");
		}
		else if((angle%360)==0)
		{
		    for(i=0;i<n;i++)
		    {
		        for(j=0;j<n;j++)
		        {
		            System.out.print(a[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
		else if((angle%360)==90)
		{
		    for(j=0;j<n;j++)
		    {
		        for(i=n-1;i>=0;i--)
		        {
		            System.out.print(a[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
		else if((angle%360)==180)
		{
		    for(i=n-1;i>=0;i--)
		    {
		        for(j=n-1;j>=0;j--)
		        {
		            System.out.print(a[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
		else if((angle%360)==270)
		{
		    for(j=n-1;j>=0;j--)
		    {
		        for(i=0;i<n;i++)
		        {
		            System.out.print(a[i][j]+" ");
		        }
		        System.out.println();
		    }
		}

	}
}
