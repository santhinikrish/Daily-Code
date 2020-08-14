/*
Example Input/Output 1:
Input:
08:12:15
12:34:55
Output:
04:22:40
Explanation:
The entry time of the employee is 08:12:15.
The exit time of the employee is 12:34:55.
The difference between the entry time and the exit time is 04:22:40.
So 04:22:40 is printed as the output.

Example Input/Output 2:
Input:
09:30:55
11:12:15
Output:
01:41:20
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.next().split(":");
        String b[]=sc.next().split(":");
        int s1=Integer.parseInt(a[0]),e1=Integer.parseInt(b[0]);
        int s2=Integer.parseInt(a[1]),e2=Integer.parseInt(b[1]);
        int s3=Integer.parseInt(a[2]),e3=Integer.parseInt(b[2]);
        int start=(s1*60*60)+(s2*60)+s3;
        int end=(e1*60*60)+(e2*60)+e3;
        int tot=Math.abs(start-end);
        int hr=0,min=0;
        if(tot>=3600){
            hr+=tot/3600;
            tot=tot%3600;
        }
        if(tot>=60){
            min+=tot/60;
            tot=tot%60;
        }
        int sec=tot;
        System.out.printf("%02d:%02d:%02d",hr,min,sec);
	}
}
