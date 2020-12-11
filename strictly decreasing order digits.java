/*
Example Input/Output 1:
Input:
100 5000
Output:
4321 3210 987 876 765 654 543 432 321 210
Explanation:
The integers from 5000 to 100 which are having the digits in strictly decreasing order by 1 are given below.
4321 3210 987 876 765 654 543 432 321 210

Example Input/Output 2:
Input:
150 200
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        int p=0;
        for(int i=y;i>=x;i--){
            char a[]=(Integer.toString(i)).toCharArray();
            if(a.length>1){
              break;
            }
            int c=1;
            for(int j=0;j<a.length-1;j++){
                if((a[j]-'0')==(a[j+1]-'0')+1){
                      c++;
                }
            }
            if(c==a.length) {
                System.out.print(i+" ");
                p=1;
            }
        }
        if(p==0) System.out.print("-1");
	}
}

m,n=map(str,input().split())
x,y=len(m),len(n)
s="9876543210"
p=[]
for t in range(y,x-1,-1):
    for i in range(len(s)-t+1):
        k=int(s[i:i+t])
        if k<=int(n) and k>=int(m) and k>9:
            p.append(k)
if(p):
    print(*p)
else:
    print(-1)
