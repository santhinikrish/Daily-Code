/*
Example Input/Output 1:
Input: 6 5
32 94 99 26 82
51 69 52 63 17
90 36 88 55 33
93 42 73 39 28
81 31 83 53 10
12 29 85 80 87
42 80
Output: YES
Explanation:
Here the integers 42 and 80 are present diagonally in the matrix.
32 94 99 26 82
51 69 52 63 17
90 36 88 55 33
93 42 73 39 28
81 31 83 53 10
12 29 85 80 87
So YES is printed as the output.

Example Input/Output 2:
Input: 7 5
79 40 13 74 99
73 77 32 72 87
93 82 95 57 50
61 33 54 71 16
15 92 65 10 27
35 42 90 49 47
81 83 51 11 56
42 50
Output: YES

Example Input/Output 3:
Input: 4 6
99 56 91 65 34 39
75 42 30 64 41 89
66 29 93 35 85 68
16 33 95 74 62 54
29 41
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        int p[]=new int[n+m-1];
        int q[]=new int[n+m-1];
        for(int i=0;i<n+m-1;i++){
            p[i]=q[i]=0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==x||a[i][j]==y){
                    if(q[i+j]==1||p[j-i+n-1]==1){
                        System.out.print("YES");
                        System.exit(1);
                    }else{
                        q[i+j]=1;
                        p[j-i+n-1]=1;
                    }
                }
            }
        }
        System.out.print("NO");
	}
}
