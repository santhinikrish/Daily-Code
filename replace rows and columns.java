/*
Example Input/Output 1:
Input: 3 3
1 2 3
4 5 6
7 8 9
D
Output:
7 8 9
7 8 9
7 8 9
Explanation:
Here CH = D. So each row is replaced with the last row in the matrix.
Hence the output is
7 8 9
7 8 9
7 8 9

Example Input/Output 2:
Input: 4 5
66 23 32 59 14
82 72 63 41 69
23 43 98 59 95
63 34 83 13 94
l
Output:
66 66 66 66 66
82 82 82 82 82
23 23 23 23 23
63 63 63 63 63

Example Input/Output 3:
Input: 4 3
1 2 1
3 4 5
6 7 8
3 5 7
W
Output:
1 2 1
3 4 5
6 7 8
3 5 7
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        char c=sc.next().charAt(0);
        int j=0;
        if(c=='d'||c=='D'){
            while(j<n){
                j++;
                for(int i=0;i<m;i++){
                    System.out.print(a[n-1][i]+" ");
                }
                System.out.println();
            }
        }else if(c=='u'||c=='U'){
            while(j<n){
                j++;
                for(int i=0;i<m;i++){
                    System.out.print(a[0][i]+" ");
                }
                System.out.println();
            }
        }else if(c=='l'||c=='L'){
            int i=0;
            while(j<n){
                j++;
                for(int k=0;k<m;k++){
                    System.out.print(a[i][0]+" ");
                }i++;
                System.out.println();
            }
        }else if(c=='r'||c=='R'){
            int i=0;
            while(j<n){
                j++;
                for(int k=0;k<m;k++){
                    System.out.print(a[i][m-1]+" ");
                }i++;
                System.out.println();
            }
        }else{
            for(int i=0;i<n;i++){
                for(int h=0;h<m;h++){
                    System.out.print(a[i][h]+" ");
                }
                System.out.println();
            }
        }
	}
}
