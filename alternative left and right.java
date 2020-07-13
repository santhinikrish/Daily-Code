/*
Input:
5
12 45 78 56 23
Output:
78 45 56 12 23
Explanation:
The largest integer among the 5 integers is 78.
So 78 is printed.
Then the remaining integers present in the left and right side of the largest integer 78 are printed alternatively (45 56 12 23).
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int m=0,in=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>m){
                m=a[i];in=i;
            }
        }
        int f=n;
        System.out.print(m+" ");
        for(int i=in-1,j=in+1;;){
            if(f==0){
                break;
            }if(i>=0){
                System.out.print(a[i]+" ");
                i--;f--;
            }if(j<n){
                System.out.print(a[j]+" ");
                j++;f--;
            }
        }
	}
}
