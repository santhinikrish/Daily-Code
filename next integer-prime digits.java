/*
Example Input/Output 1: 
Input: 342
Output: 352
Explanation:
Here N=342, the next greater integer with prime digits is 352.
So 352 is printed as the output.

Example Input/Output 2:
Input: 786
Output: 2222
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(long i=n+1;;i++){
            long t=0,k=i;
            String a=Long.toString(i);
            while(i>0){
                long r=i%10;
                if(r==2||r==3||r==5||r==7) t++;
                i/=10;
            }
            if(a.length()==t){
                System.out.print(k);
                return;
            }
        }
	  }
}
