/*
input: 5
bangalore chennai
hosur vizagar
mysore goa
chennai hosur
goa bangalore
output:
mysore to goa
goa to bangalore
bangalore to chennai
chennai to hosur
hosur to vizagar
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        String b[]=new String[n];
        for(int i=0;i<n;i++){
            String str[]=sc.nextLine().split(" ");
            a[i]=str[0];
            b[i]=str[str.length-1];
        }
        int in=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(a[i].equals(b[j])){
                    c++;
                }
            }
            if(c==0){
                in=i;
            }
        }
        System.out.println(a[in]+" "+"to"+" "+b[in]);
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(b[in].equals(a[j])){
                    System.out.println(a[j]+" "+"to"+" "+b[j]);
                    in=j;
                    break;
                }
            }
        }
	}
}
