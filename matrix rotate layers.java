/*
input: 4
5 7 3 4
8 6 7 5
1 2 3 4
7 5 6 4
output:
8 5 7 3 4 5 4 4 6 5 7 1
7 6 3 2
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	 Scanner sca=new Scanner( System.in);
	 int n=sca.nextInt();
	 int[][] mat=new int[n][n];
	 for(int i=0;i<n;i++){
	     for(int j=0;j<n;j++)
	     mat[i][j]=sca.nextInt();
	 }
	 List<List<Integer>> al=new ArrayList<>();
	 int sr=0,sc=0,er=n-1,ec=n-1;
	 while(sr<=er&&sc<=ec){
	     List<Integer> li=new ArrayList<>();
	     for(int i=sc;i<=ec;i++)
	     li.add(mat[sr][i]);
	     for(int i=sr+1;i<=er;i++)
	     li.add(mat[i][ec]);
	     for(int i=ec-1;i>=sc;i--)
	     li.add(mat[er][i]);
	     for(int i=er-1;i>=sr+1;i--)
	     li.add(mat[i][sc]);
	     al.add(li);
	     sr++;
	     sc++;
	     er--;
	     ec--;
	 }
	 int ind=1;
	 for(List<Integer> i:al){
	     Collections.rotate(i,ind);
	 for(int j:i)
	 System.out.print(j+" ");
	 ind*=-1;
	 System.out.println();
    }
	}
}
