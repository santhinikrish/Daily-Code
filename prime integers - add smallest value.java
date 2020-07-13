/*input1 : 7
89 54 36 74 44 19 12
output:
0 5 1 5 3 0 1
input2 : 9
26 10 88 49 20 71 25 83 3
output:
3 1 1 4 3 0 4 0 0
*/

import java.util.*;
public class Hello {
static boolean isprime(int a){
    if(a==2){
        return true;
    }
    else if(a%2==0){
        return false;
    }
    for(int i=3;i*i<=a;i+=2){
        if(a%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int x=a[i],c=0;
            while(!isprime(x)){
                c++;
                x++;
            }
            System.out.print(c+" ");
        }
	}
}