/*
Example Input/Output 1:
Input:
10
M 50 25
M 32 15
F 65 24
M 75 25
F 40 10
F 45 17
M 25 10
M 37 12
M 60 21
F 72 25
Output:
60.00
50.00
75.00
Explanation:
Total number of students = 10.
Total number of male students = 6.
Total number of female students = 4.
M 50 25 -> Pass
M 32 15 -> Fail
F 65 24 -> Pass
M 75 25 -> Pass
F 40 10 -> Fail
F 45 17 -> Pass
M 25 10 -> Fail
M 37 12 -> Fail
M 60 21 -> Pass
F 72 25 -> Pass
The number of students passed in the exam = 6.
The number of male students passed in the exam = 3.
The number of female students passed in the exam = 3.
The overall pass percentage is 60.00 which is printed in the first line.
The pass percentage of male students is 50.00 which is printed in the second line.
The pass percentage of female students is 75.00 which is printed in the third line.

Example Input/Output 2:
Input:
5
M 51 12
F 46 22
M 29 18
M 38 13
M 41 19
Output:
60.00
50.00
100.00
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),tm=0,tg=0;
        float m=0,g=0,tot=0;
        for(int i=0;i<n;i++){
            char c=sc.next().charAt(0);
            int t=sc.nextInt(),p=sc.nextInt();
            if(c=='M') m++;
            else g++;
            if(t>=38 && p>=13){
                tot++;
                if(c=='M') tm++;
                else tg++;
            }
        }
        System.out.printf("%.2f\n%.2f\n%.2f",(tot/n*100),(tm/m*100),(tg/g*100));
	  }
}
