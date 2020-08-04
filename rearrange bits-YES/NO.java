/*
Example Input/Output 1:
Input:
10 12
Output:
YES
Explanation:
The binary representation of 10 is 1010.
The binary representation of 12 is 1100.
Here 1010 can be rearranged as 1100.
So YES is printed as the output.

Example Input/Output 2:
Input:
10 3
Output:
YES
Explanation:
The binary representation of 10 is 1010.
The binary representation of 3 is 11.
Here 1010 can be rearranged as 0011.
Here both 0011 and 11 represent the decimal value 3.
So YES is printed as the output.

Example Input/Output 3:
Input:
14 26
Output:
NO
Explanation:
The binary representation of 14 is 1110.
The binary representation of 26 is 11010.
Here 1110 can not be rearranged as 11010.
So NO is printed as the output.
*/

import java.util.*;
public class Hello {
    public static int c=0;
    public static void per(String a,String m,int n){
        if(a.length()==0){
            int m1=Integer.parseInt(m);
            if(m1==n){
                c++;
                System.out.print("YES");
            }
        }
        if(c==1){
            return;
        }else{
            for(int i=0;i<a.length();i++){
                char c=a.charAt(i);
                String ans=a.substring(0,i)+a.substring(i+1);
                per(ans,m+c,n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String s1=Integer.toBinaryString(a);
        String s2=Integer.toBinaryString(b);
        int n=Integer.parseInt(s2);
        per(s1,"",n);
        if(c==0){
            System.out.print("NO");
        }
	}
}
