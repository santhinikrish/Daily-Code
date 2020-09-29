/*
Example Input/Output 1:
Input:
7
10 20 30 40 53 43 34
Output: 2
Explanation:
Initially, he stands on the first stone and his jumping capacity J is 1.
The first stone 10 is an even integer. So his jumping capacity is increased by 3.
Now J = 4 (1 + 3).
The next stone he lands on is 53, which is an odd integer. So his jumping capacity is increased by 2.
Now J = 6 (4 + 2).
Now he can cross the 7th stone as his jumping capacity is greater than or equal to 2.
Here the total jumps required to cross the 7 stones is 2.
So 2 is printed as the output.

Example Input/Output 2:
Input:
7
23 12 13 90 45 45 46
Output: 4
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=1,c=0;
        for(int i=0;i<n-1;i+=k){
            if(a[i]%9==0){
                k-=5;
                if(k<1) k=1;
            }else if(a[i]%2==0) k+=3;
            else k+=2;
            c++;
        }
        System.out.print(c);
	}
}
