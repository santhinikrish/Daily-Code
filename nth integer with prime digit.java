/*input: 6
output: 23
input: 11
output: 35
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        for(int i=2;;i++){
            int b=i,count=0,aa=0;
            while(b>0){
                aa++;
                if(b%10==2||b%10==5||b%10==3||b%10==7){
                    count++;
                }
                b/=10;
            }
            if(count==aa){
                p++;
            }
            if(p==n){
                System.out.print(i);
                break;
            }
        }
	}
}