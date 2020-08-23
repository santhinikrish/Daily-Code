/*
Example Input/Output 1:
Input:
5 3 5 1 8 7
Output:
3 3 3 5 5
5 5 5 1 8
8 8 8 8 8
8 8 7 7 7
7 7 7 7
Explanation:
The value of N is 5, so each line of the output contains at most 5 integers.
The first integer 3. So three 3's are printed in the first line.
The second integer 5. So two 5's are printed in the first line and the remaining three 5's are printed in the second line.
The third integer 1. So only one 1 is printed in the second line.
Similarly, the remaining 2 integers 8 and 7 are printed in the same way.
Hence the output is
3 3 3 5 5
5 5 5 1 8
8 8 8 8 8
8 8 7 7 7
7 7 7 7

Example Input/Output 2:
Input: 2
12 6
Output:
12 12
12 12
12 12
12 12
12 12
12 12
6 6
6 6
6 6
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
		int c=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<a[i];j++){
		        c++;
		        System.out.print(a[i]+" ");
		        if(c%n==0){
		            System.out.println();
		        }
		    }
		}
	}
}
