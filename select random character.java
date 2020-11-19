/*
Example Input/Output 1:
Input:
nelson
oneplsn
Output: p
Explanation:
Here S = nelson and M = oneplsn.
The randomly inserted character in M is p.
So p is printed as the output.

Example Input/Output 2:
Input:
AAaa
AaAaA
Output: A
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        char s1[]=sc.next().toCharArray();
        char s2[]=sc.next().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                System.out.print(s2[i]);
                return;
            }
        }
        System.out.print(s2[s2.length-1]);
	}
}
