/*
Example Input/Output 1:
Input:
23-06-2020
Output:
24-06-2020
25-06-2020
26-06-2020
27-06-2020
28-06-2020
29-06-2020
30-06-2020
01-07-2020
02-07-2020
03-07-2020
Explanation:
The next 10 dates from the date 23-06-2020 are given below.
24-06-2020
25-06-2020
26-06-2020
27-06-2020
28-06-2020
29-06-2020
30-06-2020
01-07-2020
02-07-2020
03-07-2020

Example Input/Output 2:
Input:
25-12-2018
Output:
26-12-2018
27-12-2018
28-12-2018
29-12-2018
30-12-2018
31-12-2018
01-01-2019
02-01-2019
03-01-2019
04-01-2019
*/

import java.util.*;
public class Hello {
    public static int chan(String a){
        return Integer.parseInt(a);
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String[] s=sc.next().split("-");
        int dat=chan(s[0]);
        int mon=chan(s[1])-1;
        int yr=chan(s[2]);
        int daysM[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(yr%400==0 || yr%4==0 && yr%100!=0) daysM[1]=29;
        int pres=daysM[mon];
        for(int i=1;i<=10;){
            dat++;
            if(dat<=pres){
                System.out.printf("%02d-%02d-%d\n",dat,mon+1,yr);
                i++;
            }
            if(dat>=pres){
                mon++;
                dat=0;
                if(mon==12){
                    mon=0;
                    yr++;
                }
            }
        }
	}
}
