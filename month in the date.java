/*input: 27-11-1997
output: November
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] s=str.split("-");
        int a=Integer.parseInt(s[1]);
        String r="";
        switch(a){
            case 01:
                r="January";
                break;
             case 02:
                r="February";
                break;
            case 03:
                r="March";
                break;
            case 04:
                r="April";
                break;
            case 05:
                r="May";
                break;
            case 06:
                r="June";
                break;
            case 07:
                r="July";
                break;
            case 8:
                r="August";
                break;
            case 9:
                r="September";
                break;
            case 10:
                r="October";
                break;
            case 11:
                r="November";
                break;
            case 12:
                r="December";
                break;
        }
        System.out.print(r);
	}
}