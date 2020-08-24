/*
Example Input/Output 1:
Input: 888
Output: 64864
Explanation: Here N = 888.
After replacing the first and last digits of the integer 888 with its square value, the integer becomes 64864.
So 64864 is printed as the output.

Example Input/Output 2:
Input: 5000
Output: 25000

Example Input/Output 3:
Input: 123
Output: 129
*/

import java.util.*;
publiv class Hello
{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      System.out.print(squareTheEnds(N));
    }
    public static int squareTheEnds(int N){
        int last=(N%10)*(N%10);
        String a=Integer.toString(N);
        String mid=a.substring(1,a.length()-1);
        while(N>=10){
            N/=10;
        }
        int first=N*N;
        String fin=first+mid+last;
        return Integer.parseInt(fin);
    }
}
