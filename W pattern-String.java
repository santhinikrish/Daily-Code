/*Input Format: 
The first line contains S1. 
The second line contains S2. 
The third line contains S3. 

Output Format: 
The first R lines, each contains C characters of the modified matrix. 

Example Input/Output 1: 
Input: 
TELEPHONE 
ALERT 
BRAVE 

Output: 
A***P***B 
L**E*H**R 
E*L***O*A 
RE*****NV 
T*******E 

Explanation: 
S1 = TELEPHONE 
S2 = ALERT 
S3 = BRAVE 
Here R = 5 and C = 9 (The length of the shortest string "ALERT" or "BRAVE" is 5 and the length of the longest string "TELEPHONE" is 9). 
So the character matrix of size 5x9 is generated with asterisks. 
********* 
********* 
********* 
********* 
********* 
After rearranging the given string values, A = ALERT B = TELEPHONE C = BRAVE After modifying the matrix as per the given conditions, it becomes 
A***P***B 
L**E*H**R 
E*L***O*A 
RE*****NV 
T*******E 

Example Input/Output 2: 
Input: 
Files 
skillRack 
FLASk 

Output: 
F***l***F 
i**l*R**L 
l*i***a*A 
ek*****cS 
s*******k
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        int l,m,n;
        l=a.length();m=b.length();n=c.length();
        int fin=l;
        String lar=a;
        if(m>l){
            fin=m;
            lar=b;
        }
        if(n>l){
            fin=n;
            lar=c;
        }
        int co=fin;
        int r=(fin/2)+1;
        String s1="",s2="",s3="";
        if(lar==a){
            if(lar.charAt(0)==b.charAt(m-1)){
                s1=b;
                s3=c;
            }else if(lar.charAt(0)==c.charAt(n-1)){
                s1=c;
                s3=b;
            }
        }else if(lar==b){
            if(lar.charAt(0)==a.charAt(l-1)){
                s1=a;
                s3=c;
            }else if(lar.charAt(0)==c.charAt(n-1)){
                s1=c;
                s3=a;
            }
        }else{
            if(lar.charAt(0)==a.charAt(l-1)){
                s1=a;
                s3=b;
            }else if(lar.charAt(0)==b.charAt(m-1)){
                s1=b;
                s3=a;
            }
        }
        s2=lar;
        char mat[][]=new char[r][co];
        for(int i=0;i<r;i++){
            for(int j=0;j<co;j++){
                mat[i][j]='*';
            }
        }
        int k=0;
        for(int i=0;i<r;i++){
            mat[i][0]=s1.charAt(k++);
        }
        int x=0;
        for(int i=0;i<r;i++){
            mat[i][co-1]=s3.charAt(x++);
        }
        int z=s2.length()/2;
        for(int i=0;i<r;i++){
            for(int j=0;j<=co/2;j++){
                if(i+j==r-1){
                    mat[i][j]=s2.charAt(z--);
                }
            }
        }
        int d=s2.length()/2+1;
        for(int i=0;i<r;i++){
            for(int j=co/2+1;j<co;j++){
                if(i+co/2+1==j+1){
                    mat[i][j]=s2.charAt(d++);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<co;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
	}
}