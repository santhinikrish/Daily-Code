/*
Example Input/Output 1:
Input:
4 2
3 4 3 1
Output: 3
Explanation:
All possible subarrays are {3}, {4}, {3}, {1}, {3, 4}, {4, 3}, {3, 1}, {3, 4, 3}, {4, 3, 1} and {3, 4, 3, 1}.
There are 3 subarrays having exactly 2 odd integers {3, 4, 3}, {4, 3, 1} and {3, 1}.
So 3 is printed as the output.

Example Input/Output 2:
Input:
5 3
1 2 2 3 4
Output: 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),r=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int c=0;
                for(int l=i;l<=j;l++){
                    if(a[l]%2!=0) c++;
                }
                if(c==k) r++;
            }
        }
        System.out.print(r);
	  }
}
