/*
Example Input/Output 1:
Input:
5 6
27 39 26 36 12 30
25 84 77 52 97 34
99 87 62 28 19 21
22 72 70 47 90 73
82 68 59 33 38 96
3 4
Output:
84 97 82 96
Explanation:
Here X = 3 and Y = 4.
The top-left submatrix is given below.
27 39 26
25 84 77
The top-right submatrix is given below.
12 30
97 34
The bottom-left submatrix is given below.
22 72 70
82 68 59
The bottom-right submatrix is given below.
90 73
38 96
So the maximum integer in each submatrix is printed.
Hence the output is 84 97 82 96

Example Input/Output 2:
Input:
7 7
19 77 20 36 92 72 69
55 73 43 61 97 15 42
56 30 65 34 63 20 33
32 98 40 31 40 35 96
16 94 92 51 13 18 29
65 46 13 80 81 55 81
37 16 82 67 74 82 71
4 4
Output:
77 97 94 82
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt()-1,y=sc.nextInt()-1,max1=0,max2=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                max1=Math.max(a[i][j],max1);
            }
            for(int j=y+1;j<m;j++){
                max2=Math.max(a[i][j],max2);
            }
        }
        System.out.print(max1+" "+max2+" ");
        int max3=0,max4=0;
        for(int i=x+1;i<n;i++){
            for(int j=0;j<y;j++){
                max3=Math.max(a[i][j],max3);
            }
            for(int j=y+1;j<m;j++){
                max4=Math.max(a[i][j],max4);
            }
        }
        System.out.print(max3+" "+max4);
	}
}
