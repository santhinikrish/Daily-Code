/*
Example Input/Output 1:
Input: 7 3
8 5 3 3 6 7 4
4 0 3 0 3 4 3
3 3 7 5 9 3 4
3 3 3 3 3 3 3
7 4 7 6 5 0 4
2 8 4 2 8 9 9
4 6 5 4 8 7 3
Output: YES
Explanation:
In the top of the given 7x7 matrix, a triangle with the integer 3 in its border is highlighted below.
8 5 3 3 6 7 4
4 0 3 0 3 4 3
3 3 7 5 9 3 4
3 3 3 3 3 3 3
7 4 7 6 5 0 4
2 8 4 2 8 9 9
4 6 5 4 8 7 3
So YES is printed as the output.

Example Input/Output 2:
Input: 5 0
7 8 0 4 7
1 0 5 0 8
0 0 1 0 0
4 5 8 6 3
0 1 3 7 3
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int h=n/2,y=0;
        int m[]=new int[n*2];
        m[y++]=a[0][h];
        int row=1,col=h-1;
        while(row<=n/2 && col>=0){
            m[y++]=a[row][col];
            row++;
            col--;
        }
        row=1;col=h+1;
        while(row<n && col<n){
            m[y++]=a[row][col];
            row++;
            col++;
        }
        for(int i=0;i<n;i++){
            m[y++]=a[h][i];
        }
        Set<Integer> s=new TreeSet<Integer>();
        int i=0,an=0;
        for(int dup:m){
            if(i==0){
              an=dup;
            }
            s.add(dup);
            i++;
        }
        if(s.size()==1 && an==k){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
	  }
}
