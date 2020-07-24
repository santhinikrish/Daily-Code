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

    (or)

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int tried = str.charAt(0)=='X'?1:0;
		int ind = str.indexOf("X");
		String fir = str.substring(0,ind);
		String las = str.substring(ind+1);
		while(tried!=10)
		{
		    if (Integer.valueOf(fir+tried+las)%8==0)
		    {
		        System.out.print(tried);
		        return;
		    }
		    tried++;
		}
        System.out.print(-1);
	}
}
