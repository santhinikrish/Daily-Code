/*input : 8
10 35 42 10 35 10 68 10
output: 10 35 42 10 35 68
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c;
        for(int i=0;i<n;i++){
            c=0;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                }
                if(a[i]==a[j] && c>1){
                    a[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=-1){
                System.out.print(a[i]+" ");
            }
        }
	}
}