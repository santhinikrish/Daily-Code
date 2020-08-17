/*
Example Input/Output 1:
Input: 7
5 4 0 3 1 6 2
Output: 4
Explanation:
One of the possible ways to open four rooms is given below.
0 -> 5 -> 6 -> 2 -> 0
Here the maximum number of rooms that can be opened by the boy is 4, so 4 is printed as the output.

Example Input/Output 2:
Input: 9
6 7 2 0 1 3 4 5 8
Output: 7
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=0;
        for(int i=0;i<n;i++){
            int dup=i,startind=i,c=0;
            while(true){
                int currKey=a[dup];
                dup=currKey;
                c++;
                if(currKey==startind)break;
            }
            m=Math.max(c,m);
        }
        System.out.print(m);
	}
}
