/*
Example Input/Output 1:
Input:
1 4
7
21
13 17
Output:
25
6
16
Explanation:
First Term = 1.
Common Difference = 4.
The integers in the arithmetic progression are 1, 5, 9, 13, 17, 21, 25 and so on.
The 7th term in the arithmetic progression is 25.
So 25 is printed in the first line.
The position of the term 21 in the arithmetic progression is 6.
So 6 is printed in the second line.
The absolute difference between the 13th term and the 17th term is 16 (49 - 65).
So 16 is printed in the third line.

Example Input/Output 2:
Input:
0 -3
3
-14
4 7
Output:
-6
Not Found
9
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        int g=0,flag=0,first=0,sec=0,thi=0,th1=0,th2=0;
        for(int i=n;;i+=d){
            g++;
            if(g==a){
                first=i;
            }
            if(i==b && flag==0){
                sec=g;
                flag=1;
            }else if(flag==0 && b<i){
              sec=0;
            }
            if(x==g){
                th1=i;
            }
            if(y==g){
                th2=i;
            }
            if(first!=0 && th1!=0 && th2!=0){
                break;
            }
        }
        System.out.println(first);
        if(sec==0){
            System.out.println("Not Found");
        }else{
            System.out.println(sec);
        }
        System.out.println(Math.abs(th1-th2));
	}
}


import java.util.*;
public class Hello
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int F=sc.nextInt();
		int D=sc.nextInt();
		int N=sc.nextInt(),T=sc.nextInt(),X=sc.nextInt(),Y=sc.nextInt();
		List<Integer> al=new ArrayList<>();
		int max=Math.max(N,Math.max(X,Y)),val=F;
		for(int index=0;index<10000;index++)
		{
		    al.add(val);
		    val+=D;
		}
		System.out.println(al.get(N-1));
		if(al.contains(T))
		System.out.println(al.indexOf(T)+1);
		else
		System.out.println("Not Found");
		System.out.print(Math.abs(al.get(X-1)-al.get(Y-1)));
	}
}
