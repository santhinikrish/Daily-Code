/*
input: 543X0
output: 2

input: 12X515
output: -1

input: X16
output: 2
*/
import java.util.*;
public class Hellp {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        char k='0';
        int p=0,e=10;
        String v;
        for(int i=0;i<s.length;i++){
            if(s[i]=='X'&&i==0){
                k='1';
            }
            if(s[i]=='X'){
                while(e>0){
                    s[i]=k;
                    v="";
                    for(int y=0;y<s.length;y++){
                        v+=s[y];
                    }
                    int h=Integer.parseInt(v);
                    if(h%8==0){
                        System.out.print(k);
                        p=1;
                        break;
                    }else{
                        k++;
                    }
                    e--;
                }
            }
        }
        if(p==0){
            System.out.print("-1");
        }
	}
}
