/*
Example Input/Output 1:
Input:
10
83 79 78 66 63 61 54 46 43 16
13
Output:
83
79 78
66 63 61
54 46 43 16
83 79 78 66 63
61 54 46 43 16 83
79 78 66 63 61 54 46
43 16 83 79 78 66 63 61
54 46 43 16 83 79 78 66 63
61 54 46 43 16 83 79 78 66 63
61 54 46 43 16 83 79 78 66 63 61
54 46 43 16 83 79 78 66 63 61 54 46
43 16 83 79 78 66 63 61 54 46 43 16 83
Explanation:
In the 1st line, the first integer 83 is printed.
In the 2nd line, the next two integers 79 and 78 are printed.
In the 3rd line, the next three integers 66, 63 and 61 are printed.
In the 4th line, the next four integers 54, 46, 43 and 16 are printed.
In the 5th line, the first five integers 83, 79, 78, 66 and 63 are printed by considering the 10 integers circularly.
Similarly, the remaining lines contain the integer values.

Example Input/Output 2:
Input:
3
1 2 3
10
Output:
1
2 3
1 2 3
1 2 3 1
2 3 1 2 3
1 2 3 1 2 3
1 2 3 1 2 3 1
2 3 1 2 3 1 2 3
1 2 3 1 2 3 1 2 3
1 2 3 1 2 3 1 2 3 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int x=sc.nextInt(),k=0,l=0;
        for(int i=0;i<x;i++)
        {
            l=k+i;
            for(int j=k;j<=l;j++)
            {
                System.out.print(a[j%n]+" ");
            }
            k=l+1;
            System.out.println();
        }
	}
}
