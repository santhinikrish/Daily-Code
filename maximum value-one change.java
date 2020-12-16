/*
Example Input/Output 1:
Input:
5225
Output:
30525625
Explanation:
The four possible combinations are given below.
2225, 5525, 5255 and 5222.
The maximum value M is 5525 which is obtained by replacing the 2nd digit 2 with 5.
The square of 5525 is 30525625.
So 30525625 is printed as the output.

Example Input/Output 2:
Input:
222
Output:
272484
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        long max=0L;
        for(int i=0;i<c.length;i++){
            if(c[i]=='5') c[i]='2';
            else c[i]='5';
            if(max<Long.parseLong(new String(c))){
                max=Long.parseLong(new String(c));
            }
            if(c[i]=='5') c[i]='2';
            else c[i]='5';
        }
        if(max<Long.parseLong(new String(c))) max=Long.parseLong(new String(c));
        System.out.print(max*max);
	  }
}
