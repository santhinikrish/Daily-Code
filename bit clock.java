/*
Example Input/Output 1:
Input:
1
Output:
00:01
00:02
00:04
00:08
00:16
00:32
01:00
02:00
04:00
08:00
16:00
Explanation:
The possible values of time where the sum of number of 1s in the binary representations of HH and MM is equal to 1 are given below.
00:01
00:02
00:04
00:08
00:16
00:32
01:00
02:00
04:00
08:00
16:00

Example Input/Output 2:
Input:
9
Output:
15:31
15:47
15:55
15:59
23:31
23:47
23:55
23:59
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<24;i++){
            String s1=Integer.toBinaryString(i);
            for(int j=0;j<=59;j++){
                String s2=Integer.toBinaryString(j);
                char[] s=(s1+s2).toCharArray();int c=0;
                for(int k=0;k<s.length;k++){
                    if(s[k]=='1')  c+=1;
                }
                if(c==n) System.out.printf("%02d:%02d\n",i,j);
            }
        }
	}
}
