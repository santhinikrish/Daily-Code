/*
Example Input/Output 1:
Input:
6 8
83 27 59 55 25 13 38 80
40 33 13 69 72 31 39 13
11 13 40 51 14 27 33 50
54 49 31 45 10 22 75 59
75 47 18 60 33 20 61 68
73 38 14 19 28 70 76 55
Output:
28 70 76 55 25 13 38 80
40 33 13 69 75 47 18 60
10 22 75 59 14 27 33 50
54 49 31 45 11 13 40 51
72 31 39 13 33 20 61 68
73 38 14 19 83 27 59 55
Explanation:
Here R = 6 and C = 8.
The integers swapped in the rows are highlighted below.
28 70 76 55 25 13 38 80
40 33 13 69 75 47 18 60
10 22 75 59 14 27 33 50
54 49 31 45 11 13 40 51
72 31 39 13 33 20 61 68
73 38 14 19 83 27 59 55

Example Input/Output 2:
Input:
8 4
51 66 14 71
82 88 87 19
36 72 61 78
81 63 68 74
49 45 59 40
20 48 75 79
32 23 24 60
25 26 27 83
Output:
27 83 14 71
82 88 32 23
75 79 61 78
81 63 49 45
68 74 59 40
20 48 36 72
87 19 24 60
25 26 51 66
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
        for(int i=0,k=n-1;i<n;i+=2,k-=2)
        {
            for(int j=0,l=m/2;j<m/2 && l<m;j++,l++)
            {
                int t=a[i][j];
                a[i][j]=a[k][l];
                a[k][l]=t;
            }
        }
        for(int i=0;i<n;i++,System.out.println())
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
	  }
}
