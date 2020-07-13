/*input: 5
125 5 10 788 99
output:
125******99
***5**788**
****10*****
***5**788**
125******99
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        int r[][]=new int[n][n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=0;j<n;j++){
                r[i][j]=s[k++];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print(r[i][j]);
                }else{
                    String str=r[i][j]+"";//Integer.toString(r[i][j]);
                    int l=str.length();
                    for(int g=0;g<l;g++){
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
	}
}
