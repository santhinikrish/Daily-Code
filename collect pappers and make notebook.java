/*
Example Input/Output 1:
Input:
5
40 32 61 87 44
30 93 51 74 28
Output:
40 30 93 51 61 87 44 28
Explanation:
The number of papers in the boxes he picked to make the notebook are highlighted below.
40 32 61 87 44 30 93 51 74 28
Hence the output is 40 30 93 51 61 87 44 28

Example Input/Output 2:
Input:
7
6 7 8 9 1 2 8
3 4 5 6 7 8 9
Output:
6 7 8 9 1 7 8 2 8
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p=0;
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if((a[i]+b[i])%2==0){
                if(p==0){
                    System.out.print(a[i]+" "+b[i]+" "); p=1;
                }
                else{
                    System.out.print(b[i]+" "+a[i]+" ");
                    p=0;
                }
            }else{
                if(p==0)
                System.out.print(a[i]+" ");
                else
                System.out.print(b[i]+" ");
            }
        }
	}
}
