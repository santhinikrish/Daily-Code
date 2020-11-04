/*
Example Input/Output 1:
Input: RoaR
Output: 1
Explanation: Here S = RoaR.
If the character a or o is added to the string, the palindrome can be formed as given below.
RaoaR or RoaoR
So the count 1 is printed as the output.

Example Input/Output 2:
Input: aabcd
Output: 2
Explanation: Here S = aabcd.
The minimum number of characters to be added in the string S is 2.
One of the possible palindromes is given below.
abcdcba
So the count 2 is printed as the output.

Example Input/Output 3:
Input: Abc#12cba
Output: 4
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.nextLine().toCharArray();
		int[] count = new int[256];
		for(int i=0;i<256;i++)
		    count[i] = 0;
		for(int i=0;i<ch.length;i++)
		{
		    count[ch[i]]++;
		}
		int c = -1;
		for(int i=0;i<count.length;i++)
		{
		    if(count[i]%2==1)
		        c++;
		}
		if(c==-1)
		    c = 0;
		System.out.println(c);
	}
}

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		HashMap<Character,Integer> h = new HashMap<>();
		for(int i=0;i<s.length();i++) {
		    if(!h.containsKey(s.charAt(i))) {
		        h.put(s.charAt(i),1);
		    }
		    else {
		        int x = h.get(s.charAt(i));
		        h.replace(s.charAt(i),++x);
		    }
		}
		int a = 0,c = 0;
		for(Map.Entry<Character,Integer> i:h.entrySet()) {
		    int x = (int)i.getValue();
		    if(x%2!=0) {
		        if(a==0) {
		            a++;
		        }
		        else {
		            c++;
		        }
		    }
		}
		System.out.println(c);
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		if(sb.reverse().toString().equals(s))
		{
		    System.out.print(0);
		    return;
		}
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char c:s.toCharArray())
		{
		    hm.put(c,hm.getOrDefault(c,0)+1);
		}
		int t=0;
		for(Map.Entry<Character,Integer> e:hm.entrySet())
		{
		    if(e.getValue()%2!=0)
		    t++;
		}
		System.out.print(Math.max(0,t-1));

	}
}
