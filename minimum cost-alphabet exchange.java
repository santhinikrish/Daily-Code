/*
Example Input/Output 1:
Input:
0 2 0 3 0 5 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
Output: 14
Explanation:
The minimum cost 14 is obtained by exchanging all alphabets with d or e or f.
So 14 is printed as the output.

Example Input/Output 2:
Input:
1 1 1 2 0 3 0 5 6 0 7 0 8 0 1 0 2 0 3 1 1 1 2 3 4 0
Output: 288
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int a[]=new int[123];
        for(int i=97;i<123;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MAX_VALUE;
        for(int i=97;i<123;i++){
            int t=0;
            for(int j=97;j<123;j++){
                if(i!=j)
                t+=Math.abs(i-j)*a[j];
            }
            max=Math.min(t,max);
        }
        System.out.print(max);
	}
}
