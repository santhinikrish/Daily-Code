/*
The program must accept an integer N as the input.
The program must print all the step numbers from 1 to N
as the output.If there is no such integer then the program must print -1 as the output.A number is called a step number if all the adjacent digits have an absolute difference of 1.
INPUT:
12
output:
10 12
INPUT:
130
OUTPUT:
10 12 21 23 32 34 43 45 54 56 65 67 76 78 87 89 98 101 121 123
*/



import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,c1,c2;
        if(n<10){
            System.out.print("-1");
        }else{
            for(int i=10;i<=n;i++){
                c1=0;c2=0;a=i;
                while(a>10){
                    int u=a%10;
                    int t=(a/10)%10;
                    c2++;
                    if(Math.abs(u-t)==1){
                        c1++;
                    }
                    a/=10;
                }
                if(c2==c1){
                    System.out.print(i+" ");
                }
            }
        }
	}
}