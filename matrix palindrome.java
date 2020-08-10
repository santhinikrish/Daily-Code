/*
Example Input/Output 1:
Input: 4 4
1 2 2 1
2 3 3 2
2 3 3 2
1 2 2 1
Output: YES
Explanation:
In the given 4x4 matrix, every row and every column is a palindrome. So YES is printed.

Example Input/Output 2:
Input: 3 5
2 4 3 4 2
3 7 8 7 3
5 6 1 6 5
Output: NO
Example Input/Output 3:
Input: 5 4
67 77 77 67
48 74 74 48
53 95 95 53
48 74 74 48
67 77 77 67
Output: YES
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                if(a[i][j]!=a[i][m-j-1]){
                    System.out.print("NO");
                    return;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n/2;j++){
                if(a[j][i]!=a[n-j-1][i]){
                    System.out.print("NO");
                    return;
                }
            }
        }
        System.out.print("YES");
    }
}
