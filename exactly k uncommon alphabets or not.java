/*inpit: AbcdefGh abceff 6
output: yes
expla: uncommon aphabets in both string values are 
	A d G h  a f
so count is equal to 6
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        char[] c=s.toCharArray();
        char[] c1=s1.toCharArray();
        int n=sc.nextInt();
        int l1=c.length,l2=c1.length;
        int count=0;
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c1.length;j++){
                if(c[i]==c1[j]){
                    count++;
                    break;
                }
            }
        }
        int m=(l1+l2)-(count*2);
        //System.out.print(m);
        if(m==n){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
	}
}