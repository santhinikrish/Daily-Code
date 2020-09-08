/*
Example Input/Output 1:
Input: 5 4 7
Output:
5 2
4 3
3 4
Explanation: Here N=7, the all possible combinations of getting 7 balls from the 5 red balls and the 4 blue balls are given below.
5 2
4 3
3 4

Example Input/Output 2:
Input: 13 10 4
Output:
4 0
3 1
2 2
1 3
0 4
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt();
        if(n>r && n>b){
            int t=n-r;
            while((t+r)<=n){
                System.out.println(r+" "+t);
                r--;t++;
                if(r==0 || b==t-1) break;
            }
        }else{
            int t=0;
            r=n;
            while((t+r)<=n && b>=t){
                System.out.println(r+" "+t);
                r--;t++;
                if(r==-1 || t-1==n) break;
            }
        }
	  }
}
