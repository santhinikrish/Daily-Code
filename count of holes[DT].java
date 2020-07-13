/*input: 1230000
oupt: 4
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        int h=0;
        for(int i=0;i<c.length;i++){
            int a=Integer.parseInt(String.valueOf(c[i]));
            if(a==0||a==4||a==6||a==9){
                h+=1;
            }if(a==8){
                h+=2;
            }
        }
        System.out.print(h);
	}
}
