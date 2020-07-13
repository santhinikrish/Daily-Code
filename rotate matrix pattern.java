/*input: 3
1 2 3 
4 5 6
7 8 9
output:
**1
*4 2
7 5 3
*8 6
**9
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int b[]=new int[100];
        int z[]=new int[100];
        int r=0,l=0,c=0;
        while(r<n){
            int i,j,k=0,count=0;
            for(i=r,j=0;i>=0&&j<n;i--,j++){
                b[k++]=a[i][j];
            }
            int fin=0;
            while(k<n){
                System.out.print("*");
                fin++;
                k++;
            }
            int res=0;
            for(int x=0;x<k;x++){
                if(b[x]!=-1){
                    System.out.print(b[x]+" ");
                    res++;
                    b[x]=-1;
                }
                if((fin+res)==n){
                    break;
                }
            }
            r++;
            l++;
            System.out.println();
        }
        r=n-1;
        c=1;
        while(l<(n+n)-1){
            int i,j,k=0,count=0;
            for(i=r,j=c;i>=0&&j<n;i--,j++){
                z[k++]=a[i][j];
            }
            int fin=0;
            while(k<n){
                System.out.print("*");
                fin++;
                k++;
            }
            int res=0;
            for(int x=0;x<k;x++){
                if(z[x]!=-1){
                    System.out.print(z[x]+" ");
                    res++;
                    z[x]=-1;
                }
                if((fin+res)==n){
                    break;
                }
            }
            l++;
            c++;
            System.out.println();
        }
	}
}