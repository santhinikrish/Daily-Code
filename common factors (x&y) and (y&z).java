/*
Example Input/Output 1:
Input:
24 100 80
Output:
20 10 5 4 4 2 2 1 1
Explanation:
Here X = 24, Y = 100 and Z = 80.
The common factors of 24 and 100 are 1, 2 and 4.
The common factors of 100 and 80 are 1, 2, 4, 5, 10 and 20.
So the factors are printed in descending order.
20 10 5 4 4 2 2 1 1

Example Input/Output 2:
Input:
121 11 55
Output:
11 11 1 1
*/

import java.util.*;
public class Hello {
    static List<Integer> a=new ArrayList<Integer>();
    public static void main(String[] args)
    {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        dup(x,y);dup(y,z);
        Collections.sort(a);
        for(int i=a.size()-1;i>=0;i--)
        {
            System.out.print(a.get(i)+" ");
        }
	}
	public static void dup(int n,int m)
  {
	    for(int i=1;i<=n || i<=m;i++)
      {
	        if(n%i==0 && m%i==0)
          {
	            a.add(i);
	        }
	    }
	}
}
