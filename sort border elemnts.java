/*input: 3 4
4 9 7 2
5 6 2 3
8 1 10 6

output:
1 2 3 4
10 6 2 5 
9 8 7 6
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[n][m];
        int b[]=new int[500];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
                if(i==0 || j==0 || i==r-1 || j==c-1)
                b[l++]=a[i][j]; 
            }
        }
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(b[i]>b[j])
                {
                    int t=b[i]; 
                    b[i]=b[j]; 
                    b[j]=t;
                }
            }
        }
        int k=0;
        for(int i=0;i<c;i++)
            a[0][i]=b[k++]; 
        for(int i=1;i<r;i++)
            a[i][c-1]=b[k++]; 
        for(int i=c-2;i>=0;i--)
            a[r-1][i]=b[k++]; 
        for(int i=r-2;i>0;i--)
            a[i][0]=b[k++]; 
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" "); 
            }
        System.out.println();
        }
	}
}