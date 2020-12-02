/*
Example Input/Output 1:
Input:
4
158 270 100 310
Output: 720
Explanation:
The unit digit of the 1st integer 158 is NOT equal to 0. So it remains the same.
The unit digit of the 2nd integer 270 is equal to 0. So 1 is borrowed from its tenth digit and added to the unit digit. Hence the integer becomes 261.
The unit digit of the 3rd integer 100 is equal to 0. Here it is not possible to borrow 1 from its tenth digit(as it is already 0). So it is replaced with 0.
The unit digit of the 4th integer 310 is equal to 0. So 1 is borrowed from its tenth digit and added to the unit digit. Hence the integer becomes 301.
The sum of 158, 261, 0 and 301 is 720.
So 720 is printed as the output.

Example Input/Output 2:
Input:
3
10 90 9990
Output: 10063
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            String b=String.valueOf(a),s="";
            if(a%10==0){
                if((a/10)%10==0)
                s=0+"";
                else
                s+=(b.substring(0,b.length()-2))+""+((b.charAt(b.length()-2)-'0')-1)+""+(u++)+"";
            }else{
              s=a+"";
            }
            sum+=Integer.parseInt(s);
        }
        System.out.print(sum);
	}
}
