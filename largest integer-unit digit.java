/*
Example Input/Output 1:
Input:
6
592 4215 85 702 217 92
2
Output: 702
Explanation:
The integers having the unit digit 2 among the 6 integers are 592, 702 and 92.
The largest integer is 702 which is printed as the output.

Example Input/Output 2:
Input:
9
10 69 38 60 37 16 49 8 26
5
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt(),m=0;
        for(int i=0;i<n;i++){
            if(a[i]%10==k){
                if(a[i]>m) m=a[i];
            }
        }
        if(m==0) m=-1;
        System.out.print(m);
	  }
}
