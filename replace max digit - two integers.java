/*
Example Input/Output 1: 
Input: 1878 2020 
Output: 3292 

Explanation: 
Here X = 1878 and Y = 2020. 
After replacing all the occurrences of the maximum digit 8 in 1878 with the maximum digit 2 in 2020, the integer 1878 becomes 1272. 
Here the sum of 1272 and 2020 is 3292. 
Hence the output is 3292 

Example Input/Output 2: 
Input: 1111 144 
Output: 4588 

Example Input/Output 3: 
Input: 189 1239 
Output: 1428
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int m=0,in=0;
        for(int i=0;i<a.length();i++){
            int max=Integer.parseInt(String.valueOf(a.charAt(i)));
            if(max>m){
                m=max;
                in=i;
            }
        }
        int m1=0;
        for(int i=0;i<b.length();i++){
            int max=Integer.parseInt(String.valueOf(b.charAt(i)));
            if(max>m1){
                m1=max;
            }
        }
        String s="";
        for(int i=0;i<a.length();i++){
            int h=Integer.parseInt(String.valueOf(a.charAt(i)));
            if(h==m){
                s+=m1;
            }else{
                s+=h;
            }
        }
        int n1=Integer.parseInt(s);
        int n2=Integer.parseInt(b);
        System.out.print(n1+n2);
	}
}