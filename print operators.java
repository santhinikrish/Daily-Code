/*
Example Input/Output 1:
Input: 6
2 50 7 5 1 15
10 5
Output:
/ * # - # +
Explanation:
The integer 2 is a result of 10/5. So '/' is printed.
The integer 50 is a result of 10*5. So '*' is printed.
The integer 7 is not a result of any operation of 10 and 5 (10/5, 10*5, 10+5, 10-5). So '#' is printed.
The integer 5 is a result of 10-5. So '-' is printed.
The integer 1 is not a result of any operation of 10 and 5 (10/5, 10*5, 10+5, 10-5). So '#' is printed.
The integer 15 is a result of 10+5. So '+' is printed.

Example Input/Output 2:
Input: 5
2 6 7 5 1
3 2
Output:
# * # + /

Example Input/Output 3:
Input: 8
1 27 12 11 1 27 7 5
14 13
Output:
/ + # # / + # #
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        int a=sc.nextInt(),b=sc.nextInt();
        for(int i=0;i<n;i++){
            if((a/b)==s[i]){
                System.out.print("/ ");
            }else if((a*b)==s[i]){
                System.out.print("* ");
            }else if((a+b)==s[i]){
                System.out.print("+ ");
            }else if((a-b)==s[i]){
                System.out.print("- ");
            }else{
                System.out.print("# ");
            }
        }
	}
}
