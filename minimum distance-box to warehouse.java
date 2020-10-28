/*
Example Input/Output 1:
Input:
5
7 3 8 5 11
Output: 42
Explanation:
The minimum distance the boy travel to store all N boxes in the warehouse is 42.
One of the possible ways is given below.
22(11 and 8) + 14(7 and 5) + 6(3) = 42.
So 42 is printed as the output.

Example Input/Output 2:
Input:
10
18 32 30 17 24 33 37 20 19 16
Output: 258
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=n-1;i>=0;i-=2) sum+=(a[i]*2);
        System.out.print(sum);
	}
}
