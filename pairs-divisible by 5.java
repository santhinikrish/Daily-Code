/*
Example Input/Output 1:
Input: 7 5
Output: 5
Explanation:
The integers from 1 to 7 are 1, 2, 3, 4, 5, 6 and 7.
The integers from 1 to 5 are 1, 2, 3, 4 are 5.
The 5 possible pairs are given below.
(7 and 3 in not considered as already 3 in the second list has been used with 2).
1 4
2 3
3 2
4 1
5 5

Example Input/Output 2:
Input: 16 18
Output: 15
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[x];
        int k=1;
        for(int i=0;i<n;i++){
            a[i]=k++;
        }
        k=1;
        for(int i=0;i<x;i++){
            b[i]=k++;
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<x;j++){
                int sum=a[i]+b[j];
                if(sum%5==0&&b[j]!=-1){
                    b[j]=-1;
                    c++;
                    break;
                }
            }
        }
        System.out.print(c);
	}
}
