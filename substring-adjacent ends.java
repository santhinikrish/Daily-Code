/*
Example Input/Output 1:
Input:
enVIronMENT
Output: 6
Explanation:
Here S = enVIronMENT.
There are 6 substrings where the first alphabet and the last alphabet are adjacent to each other in the English alphabet set.
nVIro
nVIronM
on
onMEN
nM MEN
So 6 is printed as the output.

Example Input/Output 2:
Input:
Graph
Output: 1

Example Input/Output 3:
Input:
aaAzZZ
Output: 9
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String a=s.substring(i,j+1);
                if((a.charAt(a.length()-1)=='z' && a.charAt(0)=='a') || (a.charAt(a.length()-1)=='a' && a.charAt(0)=='z') || (a.charAt(0)==(a.charAt(a.length()-1)+1)) || (a.charAt(0)==(a.charAt(a.length()-1)-1)))
                    c++;
            }
        }
        System.out.print(c);
	  }
}
