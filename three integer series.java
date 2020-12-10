/*
Example Input/Output 1:
Input:
10 10 40 20
Output:
10 40 20 50 60 30 110 90 80 200
Explanation:
Here N = 10, X = 10, Y = 40 and Z = 20.
The first three terms are 10, 40 and 20.
The 4th term = 50 (10+40).
The 5th term = 60 (40+20).
The 6th term = 30 (20+10).
The 7th term = 110 (50+60).
The 8th term = 90 (60+30).
The 9th term = 80 (50+30).
The 10th term = 200 (110+90).
Hence the output is 10 40 20 50 60 30 110 90 80 200

Example Input/Output 2:
Input:
17 8 3 4
Output:
8 3 4 11 7 12 18 19 23 37 42 41 79 83 78 162 161
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<3;i++){
            a[i]=sc.nextLong();
            System.out.print(a[i]+" ");
        }
        for(int i=3;i<n;i++){
            if((i+1)%3==0){
                a[i]=a[i-3]+a[i-2-3];
                System.out.print(a[i]+" ");
            }else{
                a[i]=a[i-3]+a[i-2];
                System.out.print(a[i]+" ");
            }
        }
	  }
}
