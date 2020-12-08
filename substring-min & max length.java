/*
Example Input/Output 1:
Input:
skillrack
2 3 4
Output: YES
Explanation:
Here X = 2, M = 3 and N = 4.
The substrings ill and llr contain 2 unique characters.
The length of ill is 3 (M <= 3 <= N).
The length of llr is 3 (M <= 3 <= N).
So YES is printed as the output.

Example Input/Output 2:
Input:
BaseBall
6 2 6
Output: NO

Example Input/Output 3:
Input:
Abc#123
2 1 2
Output: YES
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int x=in.nextInt(),m=in.nextInt(),n=in.nextInt();
    Set<Character> l=new HashSet<Character>();
		for(int i=0;i<s.length();i++){
		    for(int k=i;k<s.length();k++){
		        String a=s.substring(i,k+1);
		        if(a.length()>=m && a.length()<=n){
		            for(int j=0;j<a.length();j++)
		                 l.add(str.charAt(j));
            }
		        if(l.size()==x){
		            System.out.print("YES");
                return;
		        }
            l.clear();
		    }
		}
    System.out.print("NO");
	}
}
