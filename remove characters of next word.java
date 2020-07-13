/*
input: racing ring
output: ac ring

input: alway$ put yOur beSt fOot forward
output: alway$ pt yOur be$ Ot forward
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int l=s.length;
        for(int i=0;i<l;i++){
            if(i==l-1){
                System.out.print(s[i]);
                break;
            }
            String a1=s[i];
            String b=s[i+1];
            char a[]=a1.toCharArray();
            int c=0;
            for(int k=0;k<b.length();k++){
                for(int j=0;j<a.length;j++){
                    if(b.charAt(k)==a[j]){
                        a[j]='`';
                        c++;
                    }
                }
            }
            int o=a.length;
            for(int h=0;h<a.length;h++){
                if(a[h]!='`'){
                    System.out.print(a[h]);
                }
            }
            if(c!=o)
            System.out.print(" ");
        }
	}
}