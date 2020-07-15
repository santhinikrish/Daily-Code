/*
input: 5 10 15
output: 44
input: 6 10 15
54
input: 10 2 6
output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		for(int i=x;i<=y;i++){
		  if(i%2==0&&!l.contains(i)){
		  if(l.size()<(n-n%2)) l.add(i);
		  if(l.size()<(n-n%2)&&!l.contains(i/2)) l.add(i/2);
		  }
		}
		if(l.size()<n){
		    for(int i=x;i<=y;i++){
		        if(i%2!=0&&!l.contains(i)&&l.size()<n)
		        l.add(i);
		    }
		}
		if(l.size()<n) System.out.print(-1);
		else System.out.print(l.stream().mapToLong(ans->ans).sum());

	}
}
        (or)

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int x=scan.nextInt(),y=scan.nextInt();
        int sum=0;
        ArrayList<Integer> arr=new ArrayList<>();
        int limit=(n/2)*2;
        int i=0;
        int even=x%2==0? x: x+1;
        int odd=x%2==0? x+1:x;
        while(i<limit && even<=y){
            if(!arr.contains(even)){
                sum+=even;
                arr.add(even);
                i++;
            }
            if(!arr.contains(even/2)){
                sum+=(even/2);
                arr.add(even/2);
                i++;
            }
            even+=2;
        }
        while(i<n && odd<=y){
            if(!arr.contains(odd)){
                arr.add(odd);
                sum+=odd;
                i++;
            }
            odd+=2;
        }
        if(i==n)System.out.print(sum);
        else System.out.print(-1);
	   }
}
