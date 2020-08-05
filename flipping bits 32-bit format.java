/*
Example Input/Output 1:
Input: 2
399861 7
Output:
4294567434
4294967288
Explanation:
The binary representation of 399861 in 32 bits is 00000000000001100001100111110101.
After toggling the bits, it becomes 11111111111110011110011000001010.
The decimal equivalent of the above binary representation is 4294567434. So it is printed.
The binary representation of 7 in 32 bits is 00000000000000000000000000000111.
After toggling the bits, it becomes 11111111111111111111111111111000.
The decimal equivalent of the above binary representation is 4294967288.
So it is printed.

Example Input/Output 2:
Input: 3
52568330
45
82730988
Output:
4242398965
4294967250
4212236307
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            String s=Long.toBinaryString(a[i]);
            int l=s.length();
            String d="",ds="";
            if(l<32){
                for(int j=0;j<32-l;j++){
                    d+='0';
                }
            }
            d+=s;
            for(int j=0;j<d.length();j++){
                if(d.charAt(j)=='0')
                    ds+='1';
                else
                    ds+='0';
            }
            System.out.println(Long.parseLong(ds,2)+" ");
        }
	  }
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 0 ; i < tc ; i++){
		    int val = sc.nextInt();
		    System.out.println((long)Integer.MAX_VALUE+(val^Integer.MAX_VALUE)+1);
		}
	}
}
