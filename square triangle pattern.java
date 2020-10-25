/*
Example Input/Output 1:
Input: 3
Output:
**9**
*4*16*
1*36*25
Explanation:
Here N = 3. R = N = 3. C = ((2*N)-1) = ((2*3)-1) = 5.
A sequence of 6 (3*3-3) integers contains 1 4 9 16 25 36.
A grid of size 3x5 with asterisks is given below.
*****
*****
*****
After replacing the asterisks with the integers in the generated sequence based on the given conditions, the grid becomes
**9**
*4*16*
1*36*25

Example Input/Output 2:
Input: 4
Output:
***16***
**9*25**
*4***36*
1*81*64*49
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=n,c=(2*n)-1;
        String mat[][]=new String[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]="*";
            }
        }
        int start=1;
        int col=0;
        for(int i=r-1;i>=0;i--)
        {
            mat[i][col++]=String.valueOf(start*start);
            start++;
        }
        col=r;
        for(int i=1;i<r;i++)
        {
            mat[i][col++]=String.valueOf(start*start);
            start++;
        }
        for(int i=c-3;i>0;i-=2)
        {
            mat[r-1][i]=String.valueOf(start*start);
            start++;
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
	  }
}
