/*input: 
08-2019
18
output:
02-2021

input:
01-2013
11
output:
12-2013
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String sp=sc.next();
        String[] s=sp.split("-");
        int n=sc.nextInt();
        int m=Integer.parseInt(s[0]);
        int h=Integer.parseInt(s[1]);
        int i=m,c=0;
        for(;;i++){
            if(c==n){
                break;
            }
            c++;
            if(i==12){
                i=0;
                h++;
            }
        }
        System.out.printf("%02d-%d",i,h);
    }
}