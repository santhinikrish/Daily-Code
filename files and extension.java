/*input: 6
hello.java
srack.c
tcinput.txt
tcoutput.txt
tcgenerator.py
student.java
output:
2 .java
1 .c
2 .txt
1 .py
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        int c,k=0;
        String z[]=new String[n];
        for(int i=0;i<n;i++){
            String a=s[i];
            z[k++]=a.substring(a.lastIndexOf('.'),a.length());
        }
        for(int i=0;i<k;i++){
            c=0;
            for(int j=i+1;j<k;j++){
                if(z[i].equals(z[j])){
                    c++;
                    z[j]="";
                }
            } 
            if(z[i]!="")
            System.out.print(c+1+" "+z[i]+'\n');
        }
	}
}