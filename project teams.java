/*
Example Input/Output 1:
Input:
6 5 -1 -6 -2 -6 7
Output:
2
Explanation:
There are 2 employees with positive ratings and 4 employees with negative ratings.
One of the possible ways is given below.
The first team can be formed with 5 employees (5 -1 -2 -6 7).
The second team can be formed with 1 employee (-6).
Hence the output is 2.

Example Input/Output 2:
Input:
9 2 -5 -7 -2 -10 -3 -4 -6 -3
Output:
3
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int pos=0,neg=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        int team=0;
        for(;neg>0 || pos>0;){
            for(int i=0;i<5;i++){
                if(i<3 && neg>0){
                    neg--;
                }
                else {
                    pos--;
                }
            }
            team++;
        }
        System.out.print(team);
	}
}
