/*
Boundary Condition(s):
2 <= R, C <= 50
1 <= X <= R
1 <= Y <= C

Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C characters separated by a space.
The (R+2)nd line contains X and Y separated by a space.

Output Format:
The first line contains the longest string among the four string values.

Example Input/Output 1:
Input:
6 8
D y j w h r y t
s a r A v g t y
l E b v m B y F
F p z w E j n s
m f p D j d r y
D v w r s e m D
4 5
Output: Evry
Explanation:
The position of the given cell is (4, 5).
S1 = Evry.
S2 = EBtt.
S3 = Edm.
S4 = EDw.
There are two string values having the same maximum length Evry and EBtt.
The string Evry is the first occurring string.
So it is printed as the output.

Example Input/Output 2:
Input:
10 7
E x e k e B h
e c j D b y e
j b l b t b d
h h C C h s d
D q j h d s d
n z s k D n h
l p i x k E D
b e a n b d v
b y d j y d d
t r y F u n u
8 2
Output: eikdsd
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        int x=sc.nextInt()-1,y=sc.nextInt()-1,p=x,q=y;
        String s1="",s2="",s3="",s4="";
        while(p>=0 && q>=0){
            s1+=a[p][q];
            p--;q--;
        }
        p=x;q=y;
        while(p>=0 && q<m){
            s3+=a[p][q];
            p--;q++;
        }
        p=x;q=y;
        while(p<n && q<m){
            s4+=a[p][q];
            p++;q++;
        }
        p=x;q=y;
        while(p<n && q>=0){
            s2+=a[p][q];
            p++;q--;
        }
        String s[]=new String[]{s1,s2,s3,s4};
        int b[]=new int[]{s1.length(),s2.length(),s3.length(),s4.length()},k=0,max=0;
        for(int i=0;i<4;i++){
            if(b[i]>max){
                max=b[i];
                k=i;
            }
        }
        System.out.print(s[k]);
	  }
}
