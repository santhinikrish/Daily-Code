import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s1[]=sc.next().toCharArray();
        char s2[]=sc.next().toCharArray();
        char c=sc.next().charAt(0);
        if(c=='+'){
            System.out.print((new String(s1))+(new String(s2)));
        }else if(c=='-'){
            for(int i=0;i<s2.length;i++){
                for(int j=0;j<s1.length;j++){
                    if(s2[i]==s1[j]){
                        s1[j]='`'; break;
                    }
                }
            }String d="";
            for(int i=0;i<s1.length;i++){
                if(s1[i]!='`') d+=s1[i];
            }
            System.out.print((d.length())==0 ? "-1" : d);
        }else{
            for(int i=0;i<s1.length || i<s2.length;i++){
                if(i<s1.length) System.out.print(s1[i]);
                if(i<s2.length) System.out.print(s2[i]);
            }
        }
	}
}
