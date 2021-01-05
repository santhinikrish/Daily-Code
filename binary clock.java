/*
Example Input/Output 1:
Input:
12:35:49
Output:
HH:MM:SS
#0 #0 #1
#0 01 10
01 10 00
10 11 01
Explanation:
The given time T is 12:35:49.
The 1st column represents the digit 1. So the hyphens in the 1st column are replaced with the binary representation of 1 (##01).
The 2nd column represents the digit 2. So the hyphens in the 2nd column are replaced with the binary representation of 2 (0010).
The 3rd column represents the digit 3. So the hyphens in the 3rd column are replaced with the binary representation of 3 (#011).
The 4th column represents the digit 5. So the hyphens in the 4th column are replaced with the binary representation of 5 (0101).
The 5th column represents the digit 4. So the hyphens in the 5th column are replaced with the binary representation of 4 (#100).
The 6th column represents the digit 9. So the hyphens in the 6th column are replaced with the binary representation of 9 (1001).

Example Input/Output 2:
Input:
00:15:59
Output:
HH:MM:SS
#0 #0 #1
#0 01 10
00 00 00
00 11 11
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.nextLine().toCharArray();
        String a=Integer.toBinaryString(Integer.parseInt(s[0]+""));
        String b=Integer.toBinaryString(Integer.parseInt(s[1]+""));
        String c1=Integer.toBinaryString(Integer.parseInt(s[3]+""));
        String d=Integer.toBinaryString(Integer.parseInt(s[4]+""));
        String e=Integer.toBinaryString(Integer.parseInt(s[6]+""));
        String f=Integer.toBinaryString(Integer.parseInt(s[7]+""));
        char c[][]=new char[4][6];
        for(int i=0;i<4;i++){
            for(int j=0;j<6;j++){
                c[i][j]='0';
            }
        }
        c[0][0]='#';c[1][0]='#';c[0][2]='#';c[0][4]='#';
        int k=a.length()-1,q=3;
        while(k>=0){
            c[q--][0]=a.charAt(k--);
        }
        k=b.length()-1;q=3;
        while(k>=0){
            c[q--][1]=b.charAt(k--);
        }
        k=c1.length()-1;q=3;
        while(k>=0){
            c[q--][2]=c1.charAt(k--);
        }
        k=d.length()-1;q=3;
        while(k>=0){
            c[q--][3]=d.charAt(k--);
        }
        k=e.length()-1;q=3;
        while(k>=0){
            c[q--][4]=e.charAt(k--);
        }
        k=f.length()-1;q=3;
        while(k>=0){
            c[q--][5]=f.charAt(k--);
        }
        System.out.println("HH:MM:SS");
        for(int i=0;i<4;i++,System.out.println()){
            for(int j=0;j<6;j++){
                if(j%2!=0) System.out.print(c[i][j]+" ");
                else System.out.print(c[i][j]);
            }
        }
	}
}
