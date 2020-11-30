/*
Example Input/Output 1:
Input:
5 3
12 5 8 1 6
Output:
14 18
Explanation:
The given 5 integers are 12, 5, 8, 1 and 6.
Here X = 3, so we need to remove 3 integers.
After removing the integer 12, the remaining 4 integers become 8 11 4 9.
After removing the integer 8, the remaining 3 integers become 14 7 11.
After removing the integer 14, the remaining 2 integers become 14 18.

Example Input/Output 2:
Input:
6 2
99 5 7 6 1 2
Output:
34 32 27 27
Explanation:
The given 6 integers are 99, 5, 7, 6, 1 and 2.
Here X = 2, so we need to remove 2 integers.
After removing the integer 99, the remaining 5 integers become 25 27 26 21 21.
After removing the integer 25, the remaining 4 integers become 34 32 27 27.

Example Input/Output 3:
Input:
4 3
2 3 1 4
Output: 10
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++){
            int m=a[i],d=n-(i+1),sum=(int)Math.ceil(m*1.0/d*1.0);
            for(int j=i+1;j<n;j++){
                a[j]+=sum;
                m-=sum;
                d--;
                sum=(int)Math.ceil(m*1.0/d*1.0);
            }
        }
        for(int i=x;i<n;i++){
            System.out.print(a[i]+" ");
        }
	}
}
