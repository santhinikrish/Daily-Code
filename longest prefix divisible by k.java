/*
Example Input/Output 1:
Input: 107812 154
Output: 1078
Explanation:
The longest prefix in 107812 which is divisible by 154 is 1078.
So 1078 is printed as the output.

Example Input/Output 2:
Input: 1573 4
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        int l=str.length();
        for(int i=l-1;i>=0;i--){
            String s=str.substring(0,i+1);
            if(Integer.parseInt(s)%n==0){
                System.out.print(s);
                System.exit(1);
            }
        }
        System.out.print("-1");
	}
}
