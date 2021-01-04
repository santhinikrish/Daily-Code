/*
Example Input/Output 1:
Input:
12 13
Output: 0
Explanation:
Here N = 12 and K = 13.
The binary representation of 12 is 1100.
So the string S = 1100.
After concatenating its reverse, the string becomes 11000011.
After inserting the character '1' at the middle, the string becomes 110010011.
Similarly, the string S is expanded as 1100100111110010011.
The 13th character in S is 0 which is printed as the output.

Example Input/Output 2:
Input:
23 44
Output: 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        String a=Integer.toBinaryString(n);
        dup(a,k);
	}
	public static void dup(String a,int l){
	    StringBuilder s=new StringBuilder(a);
	    String r=a+"1"+s.reverse().toString(),f="";
	    if(r.length()>=l)
      {
	        System.out.println(r.charAt(l-1));
	    }else
      {
	        dup(r,l);
	    }
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		String s=Integer.toBinaryString(n);
		while(s.length()<m)
		{
		    StringBuilder sb=new StringBuilder(s);
		    s+="1"+sb.reverse().toString();
		}
		System.out.print(s.charAt(m-1));

	}
}
