/*
Example Input/Output 1:
Input:
7 3
3 4 6 2 7 1 9
2 1 6
Output:
6 2 1
Explanation:
The products available in the supermarket are given below.
3 4 6 2 7 1 9
The boy wants to purchase 3 products that are given below.
2 1 6
Here all three products are available for the boy from the supermarket.
So they are printed in the order of their occurrence.
Hence the output is 6 2 1
Example Input/Output 2:
Input:
5 5
5 4 3 7 10
7 3 6 9 10
Output:
3 7 10
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }
	}
}
