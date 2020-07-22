/*
Input:
5
Output:
1 4 6 4 1
Explanation:
The first 5 rows of Pascal's triangle are given below.
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
The 5th row in Pascal's triangle is 1 4 6 4 1.
So they are printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=1L;
        System.out.print(a+" ");
        for(long i=1;i<n;i++){
            long ans=a*(n-i)/i;
            System.out.print(ans+" ");
            a=ans;
        }
	}
}
