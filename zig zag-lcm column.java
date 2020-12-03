/*
Example Input/Output 1:
Input:
5 8
71 22 16 30 28 31 40 51
32 88 78 58 33 10 90 89
34 38 41 62 12 49 72 18
45 63 91 54 76 21 56 28
16 25 67 69 31 83 73 13
2 7
Output:
1606 616 1368 630 200
Explanation:
The integers in the 2nd column (from 1st row to 5th row) are 22, 88, 38, 63 and 25.
The integers in the 7th column (from 5th row to 1st row) are 73, 56, 72, 90 and 40.
The LCM of 22 and 73 is 1606.
The LCM of 88 and 56 is 616.
The LCM of 38 and 72 is 1368.
The LCM of 63 and 90 is 630.
The LCM of 25 and 40 is 200.
Hence the output is 1606 616 1368 630 200.

Example Input/Output 2:
Input:
4 4
58 82 52 52
25 44 36 89
13 62 88 37
90 65 13 30
3 2
Output:
260 1116 88 1066
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int c1=sc.nextInt()-1,c2=sc.nextInt()-1;
        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
            System.out.print(lcm(a[i][c1],a[j][c2])+" ");
        }
	}
	public static int lcm(int a,int b){
	    int r=0;
	    for(int i=1;i<=a || i<=b;i++){
	        if(a%i==0 && b%i==0) r=i;
	    }
	    return (a*b)/r;
	 }
}
