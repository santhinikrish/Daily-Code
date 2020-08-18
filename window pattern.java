/*
Input format:
The first line contains N and X separated by a space.

Output Format:
The first (N*S)+(S+1) lines containing the S*S matrix of matrices based on the given conditions.

Example Input/Output 1:
Input: 5 1
Output:
+-----+
|*****|
|*****|
|*****|
|*****|
|*****|
+-----+
Explanation: Here N = 5 and X = 1.
The square root of 1 is 1.
So the size of the matrix is 1x1 and it contains a matrix of size 5*5 with asterisks.
Hence the output is
+-----+
|*****|
|*****|
|*****|
|*****|
|*****|
+-----+

Example Input/Output 2:
Input: 2 4
Output:
+--+--+
|**|**|
|**|**|
+--+--+
|**|**|
|**|**|
+--+--+

Example Input/Output 3:
Input: 1 16
Output:
+-+-+-+-+
|*|*|*|*|
+-+-+-+-+
|*|*|*|*|
+-+-+-+-+
|*|*|*|*|
+-+-+-+-+
|*|*|*|*|
+-+-+-+-+
*/

import java.util.*;
public class Hello {
    static void priOp(int n,int m){
        System.out.print("+");
        for(int i=0;i<n;i++){
            System.out.print("-");
            if((i+1)%m==0){
                System.out.print("+");
            }
        }
        System.out.println();
    }
    static void priAst(int n,int m){
        System.out.print("|");
        for(int i=0;i<n;i++){
            System.out.print("*");
            if((i+1)%m==0){
                System.out.print("|");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int a=(int)Math.sqrt(k);
        priOp(n*a,n);
        for(int i=0;i<n*a;i++){
            priAst(n*a,n);
            if((i+1)%n==0){
                priOp(n*a,n);
            }
        }
	}
}
