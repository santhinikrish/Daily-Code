/*
Example Input/Output 1:
Input:
7
3 2 4 5 4 8 4
4
Output:
4 5 8
Explanation:
Here N = 4.
The integers between the first occurring 4 and last occurring 4 are 5 4 8.
After sorting the integers 5, 4, 8 in ascending order, the integers become 4, 5, 8.
Hence the output is 4 5 8

Example Input/Output 2:
Input:
5
1 8 2 3 4
8
Output: -1

Example Input/Output 3:
Input:
8
39 11 38 36 29 49 11 16
11
Output:
29 36 38 49
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt(),f=-1,l=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==t)
            {
                f=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==t)
            {
                l=i;
                break;
            }
        }
        List<Integer> b=new ArrayList<Integer>();
        if(f==-1 || l==-1 || f==l || f==l-1)
        {
            System.out.print(-1);
            return;
        }else
        {
            for(int i=f+1;i<l;i++)
            {
                b.add(a[i]);
            }
        }
        Collections.sort(b);
        for(int i=0;i<b.size();i++)
        {
            System.out.print(b.get(i)+" ");
        }
	  }
}
