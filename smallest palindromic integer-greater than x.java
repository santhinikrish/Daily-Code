/*
The program must accept an N unique digits and an integer
 X as the input.The program must print the smallest 
palindromic integer,which is formed from the given N digits and is greater then X.
INPUT:
3
2 4 0
567
OUTPUT:
2002
INPUT:
4
1 2 3 4
12545
OUTPUT:
13131
*/


import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int r=c+1;
        while(r>c){
            int l=r,count=0;
        if(String.valueOf(l).equals(new StringBuilder(String.valueOf(l)).reverse().toString())){
                String b=Integer.toString(l);
                int dup[]=new int[10];
                char[] ch=b.toCharArray();
                for(int k=0;k<b.length();k++){
                    dup[ch[k]-'0']++;
                }
                for(int j=0;j<n;j++){
                        count+=dup[a[j]];
                    }
                if(count==b.length()){
                    System.out.print(r);
                    break;
                }
            }
            r++;
        }
	}
}