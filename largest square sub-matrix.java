/*
Example Input/Output 1:
Input: 7 9
43 85 91 83 26 30 70 11 95
34 72 22 19 99 79 50 90 88
80 63 51 57 64 36 38 12 25
37 67 13 53 32 81 59 48 92
62 20 74 17 96 44 52 33 98
86 16 29 58 42 66 24 61 46
68 97 40 87 28 41 65 27 55
52
Output:
64 36 38 12 25
32 81 59 48 92
96 44 52 33 98
42 66 24 61 46
28 41 65 27 55
Explanation:
The largest possible square submatrix having 52 in its middle is highlighted below.
64 36 38 12 25
32 81 59 48 92
96 44 52 33 98
42 66 24 61 46
28 41 65 27 55

Example Input/Output 2:
Input: 5 3
12 68 60
81 64 61
90 55 22
74 66 77
17 38 20
66
Output:
90 55 22
74 66 77
17 38 20

Example Input/Output 3:
Input: 4 4
65 38 90 44
87 85 92 75
51 61 41 77
25 99 67 48
65
Output: 65
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int indexi1=0,indexi2=0,indexj2=0,indexj1=0;
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==x){
                    indexi1=i;indexj1=j;indexi2=i;indexj2=j;
                }
            }
        }
        while(indexi1>0 && indexi2<n-1 && indexj1>0 && indexj2<m-1){
            indexj1--;indexj2++;indexi2++;indexi1--;
        }
        for(int i=indexi1;i<=indexi2;i++){
            for(int j=indexj1;j<=indexj2;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
	}
}
