/*
Example Input/Output 1:
Input:
4 5
3
1 2
4 3
1 5
Output:
0 0 1 0 1
0 1 1 0 1
0 1 1 0 1
1 0 1 1 0
Explanation:
Initially, the status of 4x5 grid of lamps is given below.
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
In the first query, (1, 2) represents the position of the lamp to be turned ON.
After processing the first query, the grid becomes
1 1 1 1 1
0 1 0 0 0
0 1 0 0 0
0 1 0 0 0
In the second query, (4, 3) represents the position of the lamp to be turned ON.
After processing the second query, the grid becomes
1 1 0 1 1
0 1 1 0 0
0 1 1 0 0
1 0 1 1 1
In the third query, (1, 5) represents the position of the lamp to be turned ON.
After processing the third query, the grid becomes
0 0 1 0 1
0 1 1 0 1
0 1 1 0 1
1 0 1 1 0

Example Input/Output 2:
Input:
6 6
4
1 3
2 3
4 5
5 5
Output:
1 1 0 1 1 1
1 1 1 1 1 1
0 0 0 0 0 0
1 1 1 1 0 1
1 1 1 1 1 1
0 0 0 0 0 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=0;
            }
        }
        for(int j=0;j<c;j++){
            int r=sc.nextInt(),co=sc.nextInt();
            a[r-1][co-1]=1;
            for(int i=0;i<n;i++){
                if(i!=r-1){
                    if(a[i][co-1]==0) a[i][co-1]=1;
                    else a[i][co-1]=0;
                }
            }
            for(int i=0;i<m;i++){
                if(i!=co-1){
                    if(a[r-1][i]==1) a[r-1][i]=0;
                    else a[r-1][i]=1;
                }
            }
        }
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
        }
	}
}
