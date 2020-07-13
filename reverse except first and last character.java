/*input: ball bat NOTE peNciL
output: blal bat NTOE picNeL
*/


import java.util.*;
public class Hello {
    static String revW(String str){
        int l=str.length();
        int i=1;
        int j=str.length()-2;
        char[] c=str.toCharArray();
        while(i<j){
            char t=c[i];
            c[i]=c[j];
            c[j]=t;
            i++;
            j--;
        }
        str=new String(c);
        return str;
    }
    static void rev(String str){
        String[] s=str.split("\\s");
        for(String w:s){
            System.out.print(revW(w)+" ");
        }
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        rev(s);
	}
}