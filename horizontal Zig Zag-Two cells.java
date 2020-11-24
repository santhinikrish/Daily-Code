/*
 Input:
 8 5
 x 9 D l c
 0 k F m 6
 E q n 9 z
 w d B k w
 l n 1 B C
 q 7 r G m
 F p w 5 m
 s 6 l w 0
 3 4
 6 3
 Output:
 9nqEwdBkwCB1nlq7r
 Explanation:
 In the given 8x5 character matrix, the characters from the cell (3, 4) to the cell (6, 3) in horizontal zig-zag direction are highlighted below.
 x 9 D l c
 0 k F m 6
 E q n 9 z
 w d B k w
 l n 1 B C
 q 7 r G m
 F p w 5 m
 s 6 l w 0
 So 9nqEwdBkwCB1nlq7r is printed as the output.
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] a = new char[r][c];
		for(int i=0;i<r;i++) {
		    for(int j=0;j<c;j++) {
		        a[i][j] = sc.next().charAt(0);
		    }
		}
		int x1 = sc.nextInt();
		int y1 = sc.nextInt()-1;
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		for(int i=x1-1,k=0;i<x2;i++,k++) {
		    if(i==x2-1) {
		        if(k%2==0) {
		            for(int j=y1;j>=y2-1;j--) {
		                System.out.print(a[i][j]);
		            }
		        }
		        else {
		            for(int j=y1;j<y2;j++) {
		                System.out.print(a[i][j]);
		            }
		        }
		    }
		    else if(k%2==0) {
		        for(int j=y1;j>=0;j--) {
		            System.out.print(a[i][j]);
		        }
		        y1 = 0;
		    }
		    else {
		        for(int j=y1;j<c;j++) {
		            System.out.print(a[i][j]);
		        }
		        y1 = c-1;
		    }
		}
	}
}
