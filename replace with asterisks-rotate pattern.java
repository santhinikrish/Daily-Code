/*input: 
program
rock
output:
p**g*am
**g*amp
*g*amp*
g*amp**
*amp**g
amp**g*
mp**g*a
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        char c1[]=s1.toCharArray();
        char c[]=s.toCharArray();
        for(int i=0;i<c1.length;i++){
            for(int j=0;j<c.length;j++){
                if(c1[i]==c[j]){
                    c[j]='*';
                }
            }
        }
        int l=c.length;
        for(int i=0;i<l;i++){
            for(int j=i;j<i+l;j++){
                System.out.print(c[j%l]);
            }
            System.out.println();
        }
	}
}