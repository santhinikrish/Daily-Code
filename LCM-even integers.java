/*
Example Input/Output 1:
Input: 5
2 5 3 6 4
Output: 12
Explanation:
The even integers among the 5 integers are 2, 6 and 4.
The LCM of 2, 6 and 4 is 12.
So 12 is printed as the output.

Example Input/Output 2:
Input: 5
10 21 14 89 2
Output: 70
*/

import java.util.*;
public class Hello {
    public static int findLCM(int a,int b)
    {
        return (a*b)/(findHCF(a,b));
    }
    public static int findHCF(int a,int b)
    {
        if(b==0)
            return a;
        else
            return findHCF(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                s[k++]=a[i];
            }
        }
        int lcm=s[0];
        for(int i=1;i<k;i++){
            lcm=findLCM(lcm,s[i]);
        }
        System.out.print(lcm);
	  }
}
