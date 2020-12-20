/*
Example Input/Output 1:
Input:
4
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56
59
Output:
59
58 29
23 59
29 70
59 54
59 54
82 67
23 59
86 82
50 23 59
51 86 82
10 60 37
Explanation:
All four possible 2x2 square submatrices which contain the integer 59 in one of the four corners are highlighted below.
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56
The only possible 3x3 square submatrix which contains the integer 59 in one of the four corners is highlighted below.
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56

Example Input/Output 2:
Input:
5
54 84 73 27 83
50 63 42 19 23
21 87 34 16 14
37 38 77 90 57
43 11 79 47 64
34
Output:
34
63 42
87 34
42 19
34 16
34 16
77 90
87 34
38 77
54 84 73
50 63 42
21 87 34
73 27 83
42 19 23
34 16 14
34 16 14
77 90 57
79 47 64
21 87 34
37 38 77
43 11 79
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=0,j=0,f=1,m;
		int a[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    a[i][j]=sc.nextInt();
		}
		int k=sc.nextInt();
		hello:
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        if(a[i][j]==k)
		        break hello;
		    }
		}
		System.out.println(k);
		while(f<n)
		{
		    if(i-f>=0)
		    {
		        if(j-f>=0)
		        {
		        for(k=i-f;k<=i;k++)
		        {
		            for(m=j-f;m<=j;m++)
		            System.out.print(a[k][m]+" ");
		            System.out.println();
		        }
		        }
		        if(j+f<n)
		        {
		            for(k=i-f;k<=i;k++)
		            {
		                for(m=j;m<=j+f;m++)
		                System.out.print(a[k][m]+" ");
		                System.out.println();
		            }
		        }
		    }
		    if(i+f<n)
		    {
		        if(j+f<n)
		        {
		            for(k=i;k<=i+f;k++)
		            {
		                for(m=j;m<=j+f;m++)
		                System.out.print(a[k][m]+" ");
		                System.out.println();
		            }
		        }
		        if(j-f>=0)
		        {
		            for(k=i;k<=i+f;k++)
		            {
		                for(m=j-f;m<=j;m++)
		                System.out.print(a[k][m]+" ");
		                System.out.println();
		            }
		        }
		    }
		    f++;
		}
	}
}

import java.util.*;
public class Hello {
    public static void printSubMatrixes(int[][] arr,int N,int X,int R,int C,int size)
    {
        if(R-size>=0&&C-size>=0)
        {
            for(int row=R-size;row<=R;row++)
            {
                for(int col=C-size;col<=C;col++)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
        }
        if(R-size>=0&&C+size<N)
        {
            for(int row=R-size;row<=R;row++)
            {
                for(int col=C;col<=C+size;col++)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
        }
        if(R+size<N&&C+size<N)
        {
            for(int row=R;row<=R+size;row++)
            {
                for(int col=C;col<=C+size;col++)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
        }
        if(R+size<N&&C-size>=0)
        {
            for(int row=R;row<=R+size;row++)
            {
                for(int col=C-size;col<=C;col++)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		int[][] arr=new int[N][N];
		for(int row=0;row<N;row++)
		for(int col=0;col<N;col++)
		arr[row][col]=scanner.nextInt();
		int X=scanner.nextInt();
		int R=0,C=0;
		for(int row=0;row<N;row++)
		{
		    for(int col=0;col<N;col++)
		    {
		        if(arr[row][col]==X)
		        {
		        R=row;
		        C=col;
		        break;
		        }
		    }
		}
		System.out.println(X);
		for(int size=2;size<=N;size++)
		printSubMatrixes(arr,N,X,R,C,size-1);
	}
}
