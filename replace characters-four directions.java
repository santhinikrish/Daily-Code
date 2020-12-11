/*
Example Input/Output 1:
Input:
6 8
U X C S R N Z L
D U O T V G C N
J Q X Z S W B L
I R R P H X U U
L Q L J T G A A
V C D L X Z C E
Output:
* * * * R * * L
D U O T * G C N
* * * * * * B L
I R R * * * * *
L * L J T G * A
* * * L X Z * E
Explanation:
Here R = 6 and C = 8.
After replacing the characters in the matrix as per the given conditions, the matrix becomes
* * * * R * * L
D U O T * G C N
* * * * * * B L
I R R * * * * *
L * L J T G * A
* * * L X Z * E

Example Input/Output 2:
Input:
5 5
A J U Q B
G W Y L J
O P H F O
P R D E W
T X O W K
Output:
* J U Q B
* * * L *
* P H F *
* R * * *
T X O W *
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        for(int i=0;i<n;i++){
            int l=0;
            for(int j=m-1;j>=0;j--){
                if(a[i][j]=='L'){
                    l=j;
                    break;
                }
            }
            for(int j=0;j<l;j++){
                if(a[i][j]!='L' && a[i][j]!='R' && a[i][j]!='B' && a[i][j]!='T')
                    a[i][j]='*';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='T'){
                    for(int k=0;k<i;k++){
                        if(a[k][j]!='T' && a[k][j]!='R' && a[k][j]!='B' && a[k][j]!='L')
                            a[k][j]='*';
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            int r=0;
            for(int j=0;j<m;j++){
                if(a[i][j]=='R')
                    r=1;
                if(r==1 && a[i][j]!='R' && a[i][j]!='L' && a[i][j]!='B' && a[i][j]!='T')
                    a[i][j]='*';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='B'){
                    for(int k=i;k<n;k++){
                        if(a[k][j]!='B' && a[k][j]!='T' && a[k][j]!='R' && a[k][j]!='L')
                            a[k][j]='*';
                    }
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
