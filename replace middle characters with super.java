/*input: skillrack
output: skil*rack
input: abc@3345
output: abc**345
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int l=c.length;
        int a=l/2;
        for(int i=0;i<l;i++){
            if(l%2!=0){
                if(i==a){
                    System.out.print("*");
                }else{
                    System.out.print(c[i]);
                }
            }
            else{
                if(i==a-1||i==a){
                    System.out.print("*");
                }else{
                    System.out.print(c[i]);
                }
            }
        }
	}
}