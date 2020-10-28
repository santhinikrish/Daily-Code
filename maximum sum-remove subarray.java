/*
Example Input/Output 1:
Input:
7
10 20 5 2 -5 66 -69
3
Output:
-5 66 -69
Explanation:
The 7 integers are 10 20 5 2 -5 66 -69.
The maximum sum 37 is obtained by removing the last subarray [-5, 66, -69].
Hence the output is -5 66 -69

Example Input/Output 2:
Input:
9
2 12 3 5 4 3 3 8 1
4
Output:
3 5 4 3
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
        int k=sc.nextInt(),max=Integer.MIN_VALUE,u=0,v=0;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=0;j<i;j++) sum+=a[j];
            for(int j=i+k;j<n;j++) sum+=a[j];
            if(sum>max){
                max=sum;
                u=i;v=i+k;
            }
        }
        for(int i=u;i<v;i++)
        System.out.print(a[i]+" ");
	}
}
