Input: 
10 6 
Output: 27 
Explanation: 
The binary representation of 10 is 1010. 
The binary representation of 6 is 110. 
After concatenating the bits from the binary representations of 10 and 6 alternatively in reverse order, 
the binary representation B becomes 0011011. 
The decimal equivalent of 0011011 is 27, so 27 is printed as the output. 

Example Input/Output 2: 
Input: 7 16 
Output: 169
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String x=Integer.toBinaryString(a);
        String y=Integer.toBinaryString(b);
        String r="";
        StringBuilder s1=new StringBuilder(x);
        s1.reverse().toString();
        StringBuilder s2=new StringBuilder(y);
        s2.reverse().toString();
        for(int i=0;i<s1.length()||i<s2.length();i++){
            if(i<s1.length())
            r+=s1.charAt(i);
            if(i<s2.length())
            r+=s2.charAt(i);
        }
        long d=Long.parseLong(r,2);
        System.out.print(d);
	}
}