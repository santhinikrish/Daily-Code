/*
Example Input/Output 1:
Input:
6
3 54 8 100 6 200 80
Output:
54 100
8 100
100 200
80 200
Explanation:
Here N=6 and K=3.
There are four windows of size 3.
1st Window: 54 8 100 The largest two values are 54 100.
2nd Window: 8 100 6 The largest two values are 8 100.
3rd Window: 100 6 200 The largest two values are 100 200.
4th Window: 6 200 80 The largest two values are 80 200.
Hence the output is
54 100
8 100
100 200
80 200

Example Input/Output 2:
Input:
7
5 98 29 66 56 90 41 42
Output:
90 98
66 90
66 90
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int a[]=new int[n],b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        List<Integer> s=new ArrayList<Integer>();
        for(int i=0;i<=n-k;i++)
        {
            for(int j=i;j<i+k;j++)
            {
               s.add(a[j]);
            }
            Collections.sort(s);
            System.out.println(s.get(k-2)+" "+s.get(k-1));
            s.clear();
        }
	}
}
