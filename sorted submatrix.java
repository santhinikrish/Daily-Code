/*
Example Input/Output 1:
Input:
4 5
1 9 1 2 4
8 9 2 3 6
3 7 5 7 8
5 1 2 3 4
3
Output: YES
Explanation:
In the given 4x5 matrix, the 3x3 sub-matrix with sorted rows and columns is highlighted below.
1 9 1 2 4
8 9 2 3 6
3 7 5 7 8
5 1 2 3 4
So YES is printed as the output.

Example Input/Output 2:
Input:
3 4
1 2 3 4
5 6 7 8
9 0 1 2
3
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt(),res=0;
        for(int i=0;i<=n-x;i++){
            for(int j=0;j<=m-x;j++){
                int count=1;
                for(int k=i;k<i+x;k++){
                    int b[]=new int[x],c[]=new int[x];
                    int o=0,y=0,p=0;
                    for(int l=j;l<j+x;l++){
                        b[o++]=a[k][l];
                        c[y++]=a[k][l];
                    }
                    Arrays.sort(b);
                    for(int l=0;l<o;l++){
                        if(b[l]!=c[l]){
                            p=1; break;
                        }
                    }
                    if(p==0) count++;
                }
                trans(a,x);
                for(int k=i;k<i+x;k++){
                    int b[]=new int[x],c[]=new int[x];
                    int o=0,y=0,p=0;
                    for(int l=j;l<j+x;l++){
                        b[o++]=a[k][l];
                        c[y++]=a[k][l];
                    }
                    Arrays.sort(b);
                    for(int l=0;l<o;l++){
                        if(b[l]!=c[l]){
                            p=1; break;
                        }
                    }
                    if(p==0) count++;
                }
                if(count==(x*2)) res++;
            }
        }
        System.out.print((res>0)?"YES":"NO");
	}
	public static void trans(int m[][],int l){
	    int a[][]=new int[l][l];
	    for(int i=0;i<l;i++){
	        for(int j=0;j<l;j++){
	            a[i][j]=m[j][i];
	        }
	    }
	    for(int i=0;i<l;i++){
	        for(int j=0;j<l;j++){
	            m[i][j]=a[i][j];
	        }
	    }
	}
}
