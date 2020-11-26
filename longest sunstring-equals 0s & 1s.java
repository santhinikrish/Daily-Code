/*
Example Input/Output 1:
Input:
011011000
Output:
1100
Explanation:
The given string is 011011000.
The longest substring with equal 1s and 0s where all the 1s present in the first half is 1100.
So 1100 is printed as the output.

Example Input/Output 2:
Input:
000111001100111000
Output:
000111

Example Input/Output 3:
Input:
1111111
Output: -1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
String s=in.next(),s1="";
int len=0;
for(int i=0;i<s.length();i++)
{
    String t="";
    for(int j=i;j<s.length();j++)
    {
    t+=s.charAt(j);
    if(check(t) && len<t.length())
    {
        s1=t;len=t.length();
    }
    }
}
if(s1.length()==0)
System.out.println(-1);
else
System.out.println(s1);
	}
	public static boolean check(String t)
	{
	    int count1=0,count2=0;
	    for(int i=0;i<t.length();i++)
	    {
	        if(t.charAt(i)=='1')
	        count1++;
	        else
	        count2++;
	    }
	    if(count2!=count1)
	    return false;
	    String e="0".repeat(count1)+"1".repeat(count2);
	    String e2="1".repeat(count2)+"0".repeat(count1);
	    return (e.equals(t) || e2.equals(t));
	}
}
