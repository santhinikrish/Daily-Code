/*
Example Input/Output 1:
Input:
110111000100
Output:
1 2 4 8
Explanation:
Here S = 110111000100.
The unique powers of 2 formed using the substrings of S are given below.
1 (1),
2 (10),
4 (100) and
8 (1000).
Hence the output is 1 2 4 8

Example Input/Output 2:
Input:
00100000
Output:
1 2 4 8 16 32
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		String s=new Scanner(System.in).next();
		for(int i=0;i<65;i++)
		{
		    long a=(long)Math.pow(2,i);
		    if(s.contains(Long.toBinaryString(a)))
		    System.out.print(a+" ");
		}
	}
}

import java.util.*;
public class Hello
{
    static boolean findPowerOf2(long n)
    {
        if(n==0)
        return false;
        while(n!=1)
        {
            if(n%2!=0)
            return false;
            n/=2;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Set<Long> set=new LinkedHashSet<>();
        for(int index=0;index<str.length();index++)
        {
            for(int ctr=index+1;ctr<=str.length();ctr++)
            {
                String s=str.substring(index,ctr);
                long n=Long.parseLong(s,2);
                if(findPowerOf2(n))
                set.add(n);
            }
        }
        for(Long num:set)
        System.out.print(num+" ");
	}
}
