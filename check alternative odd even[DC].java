/*input: 5
45 22 37 14 55
output: yes
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
        int p=0;
        for(int i=0;i<n-1;i++){
            if(a[i]%2==0 && a[i+1]%2!=0){
                p++;
            }
            if(a[i]%2!=0 && a[i+1]%2==0){
                p++;
            }
        }
        if(n==p+1){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
	}
}
