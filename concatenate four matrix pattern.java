/*
Boundary Condition(s):
2 <= N <= 50 1 <= Matrix element value <= 100

Input Format:
The first line contains N. The next N lines, each contains N integers separated by a space.

Output Format:
The first 2*N lines containing the large matrix.

Example Input/Output 1:
Input : 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 1 2 3
4 5 * * 5 6
7 * * * * 9
1 * * * * 3
4 5 * * 5 6
7 8 9 7 8 9
Explanation:
The large matrix formed by concatenating the given 3x3 matrix is given below.
1 2 3 1 2 3
4 5 6 4 5 6
7 8 9 7 8 9
1 2 3 1 2 3
4 5 6 4 5 6
7 8 9 7 8 9
After replacing the integers with asterisks based on the given conditions, the large matrix becomes
1 2 3 1 2 3
4 5 * * 5 6
7 * * * * 9
1 * * * * 3
4 5 * * 5 6
7 8 9 7 8 9

Example Input/Output 2:
Input : 4
9 4 1 9
8 9 9 7
5 8 6 7
5 4 8 6
Output:
9 4 1 9 9 4 1 9
8 9 9 * * 9 9 7
5 8 * * * * 6 7
5 * * * * * * 6
9 * * * * * * 9
8 9 * * * * 9 7
5 8 6 * * 8 6 7
5 4 8 6 5 4 8 6
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1[][]=new int[n][n];
        int a[][]=new int[n+n][n+n];
        int b[][]=new int[n+n][n+n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a1[i][j]=sc.nextInt();
                a[i][j]=a1[i][j];
                b[i][j]=a[i][j];
            }
        }
        for(int i=0,k=0;i<n&&k<n;i++,k++){
            for(int j=n,l=0;j<n+n&&l<n;j++,l++){
                b[i][j]=a1[k][l];
            }
        }
        for(int i=n,k=0;i<n+n&&k<n+n;i++,k++){
            for(int j=0,l=0;j<n+n&&l<n+n;j++,l++){
                b[i][j]=a[k][l];
            }
        }
        int k=n-1,m=k+1;
        for(int i=1;i<n;i++){
            for(int j=0;j<n+n;j++){
                if((j>=k && j<=m)){
                    b[i][j]=-1;
                }
            }
            k--;m++;
        }
        int u=1,v=n+n-2;
        for(int i=n;i<n+n-1;i++){
            for(int j=0;j<n+n;j++){
                if(j>=u && j<=v){
                    b[i][j]=-1;
                }
            }
            u++;v--;
        }
        for(int i=0;i<n+n;i++){
            for(int j=0;j<n+n;j++){
                if(b[i][j]==-1)
                    System.out.print("* ");
                else
                    System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
	}
}
