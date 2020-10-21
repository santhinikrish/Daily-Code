/*
Example Input/Output 1:
Input:
2-5-9-11:3-9
Output:
2 3 4 5
5 6 7 8 9
9 10 11
3 4 5 6 7 8 9
Explanation:
There are two patterns separated by a colon.
The first pattern is 2-5-9-11.
The integers from 2 to 5 are printed in the first line.
The integers from 5 to 9 are printed in the second line.
The integers from 9 to 11 are printed in the third line.
The second pattern is 3-9.
The integers from 3 to 9 are printed in the fourth line.
Hence the output is
2 3 4 5
5 6 7 8 9
9 10 11
3 4 5 6 7 8 9

Example Input/Output 2:
Input:
5-7:4-9:3-4-8-13
Output:
5 6 7
4 5 6 7 8 9
3 4
4 5 6 7 8
8 9 10 11 12 13
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(":");
        for(int i=0;i<s.length;i++){
            String b[]=s[i].split("-");
            for(int k=0;k<b.length-1;k++){
                for(int j=Integer.parseInt(b[k]);j<=Integer.parseInt(b[k+1]);j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
	  }
}
