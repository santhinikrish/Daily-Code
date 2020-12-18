/*
Example Input/Output 1:
Input:
5
53 23 57 123 457
12 16 8 21 17
Output:
53 57 457
Explanation:
The sum of digits in 53, 23, 57, 123 and 457 are 8, 5, 12, 6 and 16 respectively.
The integers 8, 12 and 16 are present in the second line.
So their corresponding integer values 53, 57 and 457 are printed as the output.

Example Input/Output 2:
Input:
7
7211 275 888 112 205 385 400
7 24 33 10 4 3 14
Output:
275 888 112 205 400

Example Input/Output 3:
Input:
8
556 403 910 120 219 317 177 767
13 9 17 6 22 19 4 2
Output: -1
*/

import java.util.*;
public class Hello
{

    public static void main(String[] args)
    {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p=0;
        int a[]=new int[n],b[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) b[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=a[i],sum=0;
            while(m>0)
            {
                sum+=(m%10);
                m/=10;
            }
            for(int j=0;j<n;j++)
            {
                if(sum==b[j])
                {
                    System.out.print(a[i]+" ");
                    p=1;break;
                }
            }
        }
        if(p==0) System.out.print(-1);
	}
}
