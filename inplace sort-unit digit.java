/*
Example Input/Output 1:
Input:
12
32 78 95 62 42 65 35 95 15 76 46 66
Output:
32 78 15 42 62 35 65 95 95 46 66 76
Explanation:
The integers 32, 62 and 42 have the same unit digit 2.
So they are sorted in ascending order in their positions.
The integer 78 remains in the same position as there is only one integer with the unit digit 8.
The integers 95, 65, 35, 95 and 15 have the same unit digit 5.
So they are sorted in ascending order in their positions.
The integers 76, 46 and 66 have the same unit digit 6.
So they are sorted in ascending order in their positions.
Hence the output is 32 78 15 42 62 35 65 95 95 46 66 76

Example Input/Output 2:
Input:
4
50 5180 500 570
Output:
50 500 570 5180

Example Input/Output 3:
Input:
5
98 654 1652 13 1569
Output:
98 654 1652 13 1569
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        for(int i=0;i<=9;i++)
        {
	        for(int l=0;l<n-1;l++)
	        {
	            for(int j=l+1;j<n;j++)
	            {
	                if(a[l]>a[j] && a[l]%10==i && a[j]%10==i)
	                {
	                    long t=a[l];
	                    a[l]=a[j];
	                    a[j]=t;
	                }
	            }
	        }
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(a[i]+" ");
	    }
	}
}
