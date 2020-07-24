/*
Example Input/Output 1:
Input: DefeaT
Output: {Def}eaT
Explanation:
The contiguous alphabets in the string DefeaT are D, e and f. 
So they are enclosed within a pair of curly braces.
Hence the output is {Def}eaT

Example Input/Output 2:
Input: stUdeNt
Output: {stU}{de}Nt

Example Input/Output 3:
Input: onnne
Output: onnne
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int k=0,e=0;
        for(int i=1;i<s.length;i++){
            if(Character.toLowerCase(s[i])==Character.toLowerCase(s[i-1]+1)){
                e=i;
            }else{
                mass(s,k,e);
                k=e=i;
            }
        }
        mass(s,k,e);
	}
	public static void mass(char s[],int st,int e)
	{
	    int l=e-st+1;
	    if(l>1){
	        System.out.print("{");
	        while(st<=e){
	            System.out.print(s[st++]);
	        }
	        System.out.print("}");
	    }else{
	        System.out.print(s[st]);
	    }
	}
}
