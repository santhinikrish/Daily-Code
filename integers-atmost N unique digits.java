/*input: 101 120 2
output: 101 110 111 112 113 114 115 116 117 118 119

input: 23 32 1
output: -
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long n=sc.nextInt();
        int p=0;
        Set<Integer> s=new HashSet<Integer>();
        for(long i=a;i<=b;i++){
            long x=i;
            while(x>0){
                long r=x%10;
                s.add(r);
                x/=10;
            }
            if(s.size()<=n){
                System.out.print(i+" ");
                p=1;
            }
            s.clear();
        }
        if(p==0){
            System.out.print("-1");
        }
	}
}