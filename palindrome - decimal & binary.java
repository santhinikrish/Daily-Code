/*input: 585
output: yes
expla: binary rep for 585 is 1001001001. both the decimal nd binary are palindrome
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        int p=0,a=0;
        if(String.valueOf(n).equals(new StringBuilder(String.valueOf(n)).reverse().toString())){
            p=1;
        }
        if(String.valueOf(s).equals(new StringBuilder(String.valueOf(s)).reverse().toString())){
            a=1;
        }
        if(p==1&&a==1){
            System.out.print("yes");  
        }else{
            System.out.print("no");
        }
	}
}