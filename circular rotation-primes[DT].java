/*input: 131
output: YES
expla: possible rotations are 131 113 311
all three numbers are prime.so print yes else no
*/


import java.util.*;
public class Main {
static int prime(int n){
    if(n%2==0||n%3==0){
        return 1;
    }
    for(int i=5;i*i<=n;i+=6){
        if(n%i==0||n%(i+2)==0){
            return 1;
        }
    }
    return 0;
}
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,t=n;
        while(t>0){
            count++;
            t/=10;
        }
        int rem,s,a=n,p=0;
        while(prime(a)==0){
            rem=a%10;
            s=a/10;
            a=(int)((Math.pow(10,count-1))*rem)+s;
            if(a==n){
                System.out.print("YES");
                System.exit(1);
                p=1;
            }
        }
        if(p==0){
            System.out.print("NO");
        }
	}
}
