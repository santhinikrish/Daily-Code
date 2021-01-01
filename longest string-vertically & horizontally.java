/*
Example Input/Output 1:
Input:
7 6
s C G o f a
w j o t F i
b j f g k t
k G p j E p
f y w r r G
B m h h g m
e y w b m k
3 3
Output:
fpwhw
Explanation:
The position of the given cell is (3, 3).
S1 = foG.
S2 = fgkt.
S3 = fpwhw.
S4 = fjb.
The string fpwhw is the longest string. So it is printed as the output.

Example Input/Output 2:
Input:
9 5
o u w t f
a B g b D
l o k a r
x w F m C
i d k p w
j f r k p
c v x e a
o w o d E
y o b g G
5 2
Output:
dwoBu
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.next().charAt(0);
        int x=sc.nextInt(),y=sc.nextInt();
        String s1="",s2="",s3="",s4="";
        for(int i=x-1;i>=0;i--)
        {
            s1+=a[i][y-1];
        }
        for(int i=y-1;i<m;i++){
            s2+=a[x-1][i];
        }
        for(int i=x-1;i<n;i++)
        {
            s3+=a[i][y-1];
        }
        for(int i=y-1;i>=0;i--)
        {
            s4+=a[x-1][i];
        }
        String s[]={s1,s2,s3,s4},fin="";
        int l[]={s1.length(),s2.length(),s3.length(),s4.length()},max=0;
        for(int i=0;i<4;i++)
        {
            if(l[i]>max){
                max=l[i];
                fin=s[i];
            }
        }
        System.out.print(fin);
	}
}
