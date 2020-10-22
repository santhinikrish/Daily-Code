/*
Example Input/Output 1:
Input: 11
Output:
*++++*++++*
#++++#++++#
##++###++##
###########
###########
Explanation: Here N = 11.
The number of rows in the grid = (11-1)/2 = 5.
The number of rows in the grid = 11.
So the grid of size 5x11 is formed as given below.
*++++*++++*
#++++#++++#
##++###++##
###########
###########

Example Input/Output 2:
Input: 9
Output:
*+++*+++*
#+++#+++#
##+###+##
#########

Example Input/Output 3:
Input: 17
Output:
*+++++++*+++++++*
#+++++++#+++++++#
##+++++###+++++##
###+++#####+++###
####+#######+####
#################
#################
#################
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n/2,c=n,s=0,e=c-1,midL=c/2,midR=c/2;
        char a[][]=new char[r][c];
        for(int i=0;i<c;i++){
            if(i==0 || i==n/2 || i==n-1) System.out.print("*");
            else System.out.print("+");
        }
        System.out.println();
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                if(j<=s || j>=e || (j>=midL && j<=midR)){
                    System.out.print('#');
                }else{
                    System.out.print('+');
                }
            }
            System.out.println();
            s++;e--;midR++;midL--;
        }
	}
}
