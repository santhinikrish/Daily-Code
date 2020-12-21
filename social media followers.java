/*
Example Input/Output 1:
Input:
5
A->C
C<-M
V<-A
C->M
H->M
Output:
A 0
C 2
H 0
M 2
V 1
Explanation:
The user A has no followers. So the count is 0.
The user C has 2 followers M and A. So the count is 2.
The user H has no followers. So the count is 0.
The user M has 2 followers C and H. So the count is 2.
The user V has 1 follower A. So the count is 1.

Example Input/Output 2:
Input:
3
A<-B
C->A
C<-B
Output:
A 2
B 0
C 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a[]=new char[n],b[]=new char[n],c[]=new char[n];
        for(int i=0;i<n;i++){
            char s[]=sc.next().toCharArray();
            a[i]=s[0];
            b[i]=s[3];
            c[i]=s[1];
        }
        for(int i=65;i<=90;i++){
            int fol=0,p=0;
            for(int j=0;j<a.length;j++){
                if(i==(int)a[j]){
                    if(c[j]=='<') fol++;p=1;
                }
                if(i==(int)b[j]){
                    if(c[j]=='-') fol++;p=1;
                }
            }
            if(p==1) System.out.println((char)i+" "+fol);
        }
	}
}
