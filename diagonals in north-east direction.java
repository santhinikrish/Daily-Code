/*input: 3 3
73 77 76
71 17 87
37 73 98
output:
73
71 77
37 17 76
73 87
98
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r=0,l=0,c=0;
        while(r<n){
            for(int i=r,j=0;i>=0&&j<m;i--,j++){
                System.out.print(a[i][j]+" ");
            }
            r++;
            l++;
            System.out.println();
        }
        r=n-1;
        c=1;
        while(l<(n+m)-1){
            for(int i=r,j=c;i>=0&&j<m;i--,j++){
                System.out.print(a[i][j]+" ");
            }
            l++;
            c++;
            System.out.println();
        }
	}
}