/*input: skill rack
output: skil rack
input: boy water
output: boy wat*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2){
            for(int i=0;i<l2;i++){
                System.out.print(c1[i]);
            }
            System.out.print(" "+s2);
        }else if(l2>l1){
            System.out.print(s1+" ");
            for(int i=0;i<l1;i++){
                System.out.print(c2[i]);
            }
        }else{
            System.out.print(s1+" "+s2);
        }
	}
}