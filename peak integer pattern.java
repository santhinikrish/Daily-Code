/*
Example Input/Output 1:
Input:
15 4
Output:
1 2 3 4 3 2 1 2 3 4 3 2 1 2 3
Explanation:
Here N = 15 and K = 4.
So 15 integers are printed based on the given conditions.
1 2 3 4 3 2 1 2 3 4 3 2 1 2 3

Example Input/Output 2:
Input:
10 20
Output:
1 2 3 4 5 6 7 8 9 10

Example Input/Output 3:
Input:
18 3
Output:
1 2 3 2 1 2 3 2 1 2 3 2 1 2 3 2 1 2
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),p=0,t=1;
        for(int i=1;i<=n;i++){
            System.out.print(t+" ");
            if(t==k) p=1;
            else if(t==1) p=0;
            if(p==1) t--;
            else t++;
        }
	}
}
