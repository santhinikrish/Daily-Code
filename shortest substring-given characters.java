/*
Example Input/Output 1:
Input:
shopKeeper
3
p e K
Output:
pKe
Explanation:
The substring pKe is the shortest substring containing all the 3 characters p, e and K.
Hence the output is pKe.

Example Input/Output 2:
Input:
AbcCcbA
4
C b A c
Output:
AbcC
Explanation:
The substrings AbcC and CcbA are the shortest substrings containing all the 4 characters C, b, A and c.
The substring AbcC occurs first, so AbcC is printed as the output.

Example Input/Output 3:
Input:
baseBall
5
s a B e t
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		String check="";
		for(int i=0;i<n;i++)
		{
		    check+=sc.next().charAt(0);
		}
		for(int i=0;i<=str.length();i++)
		{
		    for(int j=0;j<=str.length()-i;j++)
		    {
		        String substr = str.substring(j,j+i);
		        int flag=0;
		        for(char ch:check.toCharArray()){
		            if(!substr.contains(ch+""))
		            {
		                flag=1;
		            }
		        }
		        if(flag==0)
		        {
		            System.out.print(substr);
		            System.exit(0);
		        }
		    }
		}
		System.out.print("-1");
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length();
		int n=sc.nextInt();
		sc.nextLine();
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<n;i++){
		   set.add(sc.next().charAt(0));
		}
		int min=Integer.MAX_VALUE;
		String m="";
		for(int i=0;i<l;i++){
		    String a="";
		    for(int j=i;j<l;j++){
		        a+=s.charAt(j);
		        int c=0;
		        for(Character b:set){
		            if(a.contains(b+"")){
		                c++;
		            }
		        }
		        if(c==n&&a.length()<min){
		            min=a.length();
		            m=a;
		        }
		    }
		}
		if(m.equals("")==true){
		    System.out.println("-1");
		    return;
		}
		System.out.println(m);
	}
}
