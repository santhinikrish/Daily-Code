/*
INPUT:
241
OUTPUT:
22-4444-11
2222-4-11
2-44-1111
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //char c[]=s.toCharArray();
        int l=s.length();
        for(int i=0;i<l;i++){
            int k=0,count=0;
            for(int j=i;j<i+l;j++){
                int d=s.charAt(j%l)-'0';
                count++;
                for(int z=0;z<d;z++){
                    System.out.print(s.charAt(k));
                }
                if(count!=l){
                    System.out.print("-");
                }
                if(count==l){
                    break;
                }
                k++;
            }
            System.out.print("\n");
        }
	}
}