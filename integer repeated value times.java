/*
Input:
10
2 3 4 5 3 3 5 4 2 4
Output:
2 3 4 5 3 3
Explanation:
The 10 integers are 2 3 4 5 3 3 5 4 2 4.
When we traverse till 2 3 4 5 3 3, the value 3 has occurred three times.
So the program stops printing further.
Hence the output is 2 3 4 5 3 3

Example Input/Output 2:
Input:
10
2 1 4 5 3 3 5 4 2 4
Output:
2 1

Example Input/Output 3:
Input:
9
3 5 4 6 8 7 99 64 24
Output:
3 5 4 6 8 7 99 64 24
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int p=0,c=0;
            for(int j=0;j<=i;j++)
            {
                if(a[i]==a[j]) c++;
            }
            if(c==a[i])
            {
                for(int l=0;l<=i;l++)
                {
                    System.out.print(a[l]+" ");
                }
                return;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
	}
}
