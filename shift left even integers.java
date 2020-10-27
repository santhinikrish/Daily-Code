/*
Example Input/Output 1:
Input:
6 3
42 15 66 72 27 32
Output:
66 15 72 32 27 42
72 15 32 42 27 66
32 15 42 66 27 72
Explanation:
Here N = 6 and K = 3.
Initially, the integers in the array are 42 15 66 72 27 32.
After shifting the even integers by 1 position to the left, the integers in the array become 66 15 72 32 27 42. So they are printed in the first line.
After shifting the even integers by 1 position to the left, the integers in the array become 72 15 32 42 27 66. So they are printed in the second line.
After shifting the even integers by 1 position to the left, the integers in the array become 32 15 42 66 27 72. So they are printed in the third line.

Example Input/Output 2:
Input:
5 1
6 17 22 18 11
Output:
22 17 18 6 11
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	      Scanner sc=new Scanner( System.in);
	      int n=sc.nextInt(),k=sc.nextInt();
	      int a[]=new int[n];
	      List<Integer> al=new ArrayList<>();
	       for(int i=0;i<n;i++){
	           a[i]=sc.nextInt();
	           if(a[i]%2==0)
	              al.add(a[i]);
	       }
	       for(int i=0;i<k;i++){
	       Collections.rotate(al,-1);
	       int ind=0;
	       for(int j=0;j<n;j++){
	          if(a[j]%2==0){
	             System.out.print(al.get(ind)+" ");
	             ind++;
	         }
	         else
	            System.out.print(a[j]+" ");
	     }
	     System.out.println();
	 }
	}
}
