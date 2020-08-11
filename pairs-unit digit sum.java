/*
Example Input/Output 1:
Input: 2464538
Output: 3
Explanation:
The unit digit of 2464538 is 8.
The 3 unique pairs of digits are given below.
(2, 6) -> 2 + 6 = 8
(4, 4) -> 4 + 4 = 8
(5, 3) -> 5 + 3 = 8

Example Input/Output 2:
Input: 345672
Output: -1

Example Input/Output 3:
Input: 7117471178
Output: 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length,count=0;
        int n=Integer.parseInt(String.valueOf(s[l-1]));
        ArrayList<Integer> lis=new ArrayList<Integer>();
        for(int i=0;i<l-1;i++){
            int a=Integer.parseInt(String.valueOf(s[i]));
            for(int j=i+1;j<l-1;j++){
                int b=Integer.parseInt(String.valueOf(s[j]));
                if((a+b)==n && !(lis.contains(Math.abs(a-b)))){
                    lis.add(Math.abs(a-b));
                    count++;
                }
            }
        }
        if(count==0)
        System.out.print("-1");
        else
        System.out.print(count);
	}
}
