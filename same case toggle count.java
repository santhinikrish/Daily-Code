/*input: skill_RaCk
output: 2
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        int l=0,u=0;
        for(int i=0;i<c.length;i++){
            if(Character.isLetter(c[i])){
                if(Character.isLowerCase(c[i])){
                    l++;
                }else if(Character.isUpperCase(c[i])){
                    u++;
                }
            }
        }
        if(l<u){
            System.out.print(l);
        }else{
            System.out.print(u);
        }
	}
}