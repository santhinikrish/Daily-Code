/*
Boundary Condition(s):
1 <= N, W, S, E <= 100

Input Format:
The first line contains N, W, S and E separated by a space.

Output Format:
The lines containing the characters as per the given conditions.

Example Input/Output 1:
Input:
5 7 6 5
Output:
WWWWWWWN
S------N
S------N
S------N
S------N
S-------
SEEEEE--
Explanation:
Here N = 5, W = 7, S = 6 and E = 5.
Initially, the person moves 5 steps towards the north (N).
Then the person moves 7 steps towards the west (W).
Then the person moves 6 steps towards the south (S).
Then the person moves 5 steps towards the east (E).
Then the empty places are filled with hyphens.
Hence the output is
WWWWWWWN
S------N
S------N
S------N
S------N
S-------
SEEEEE--

Example Input/Output 2:
Input:
4 3 3 3
Output:
WWWN
S--N
S--N
SEEE

Example Input/Output 3:
Input:
6 6 6 10
Output:
WWWWWWN----
S-----N----
S-----N----
S-----N----
S-----N----
S-----N----
SEEEEEEEEEE

Example Input/Output 4:
Input:
10 5 4 8
Output:
WWWWWN
S----N
S----N
S----N
SEEEEE
-----N
-----N
-----N
-----N
-----N
*/


import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),w=sc.nextInt(),s=sc.nextInt(),e=sc.nextInt(),r=0,c=0;
        if(s<n){
          if(w<e) e=w;
        }
        int r=0,c=0;
        if(n>s+1) r=n;
        else r=s+1;
        if(e>w) c=e+1;
        else c=w+1;
        char m[][]=new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]='-';
            }
        }
        for(int i=0;i<n;i++)
            m[i][w]='N';
        for(int i = 0 ;i < w ; i++)
            m[0][i]='W';
        for(int i=1;i<=s ;i++)
            m[i][0]='S';
        for(int i=1;i<=e;i++)
            m[s][i]='E';
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
	  }
}
