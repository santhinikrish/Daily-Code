/*input: 10
24 32 10 43 82 51 62 70 92 23
output :
282 192 32 284 469 253 404 304 444 288
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
        for(int i=0;i<n;i++){
            int k,t;
            int sum=0,f,l=a[i]%10;
            String str=Integer.toString(a[i]);
            f=Character.getNumericValue(str.charAt(0));
            if(i==n-1){
                k=0;
            }else{
                k=i+1;
            }
            for(int j=0;j<l;j++){
                sum=sum+a[k++];
                if(k==n){
                    k=0;
                }
            }
            if(i==0){
                t=n-1;
            }else{
                t=i-1;
            }
            for(int m=0;m<f;m++){
                sum+=a[t--];
                if(t==-1){
                    t=n-1;
                }
            }
            System.out.print(sum+" ");
        }
	}
}
