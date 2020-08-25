/*
Input: 4 5
2 3 1 4 5
2 3 7 9 6
9 8 7 8 9
5 6 3 2 5
Output:
2 2 9 5 6 3 2 5 9 6 5
3 3 8 7 8 9 4
1 7 1
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(),c = sc.nextInt(),row = 0,col = 0;
		int[][] a = new int[r][c];
		for(int i = 0;i < r; i++)
		for(int j = 0;j < c; j++)
		a[i][j] = sc.nextInt();
		while(row < r && col < c) {
		    for(int i = row;i < r; i++)
		    System.out.print(a[i][col]+" ");
		    col++;
		    for(int i = col;i < c; i++)
		    System.out.print(a[r-1][i]+" ");
		    r--;
		    for(int i = r-1; i>= row; i--)
		    System.out.print(a[i][c-1]+" ");
		    c--;
		    System.out.println();
		}
	}
}
