/*
Example Input/Output 1:
Input:
abcacb
book pen pencil book pencil pen
Output: YES
Explanation:
The characters a, b and c are matched with the words book, pen and pencil respectively.
Here the string "book pen pencil book pencil pen" follows the pattern "abcacb" , so YES is printed as the output.

Example Input/Output 2:
Input:
Xyxy
bat ball bat ball
Output: NO

Example Input/Output 3:
Input:
PQRS
doll car toy
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a[]=sc.next().toCharArray();
        sc.nextLine();
        String s[]=sc.nextLine().split(" ");
        if(a.length!=s.length){
            System.out.print("NO");
            return;
        }
        ArrayList<Character> l1=new ArrayList<Character>();
        ArrayList<String> l2=new ArrayList<String>();
        for(int i=0;i<a.length;i++){
            if(!(l1.contains(a[i])) && !(l2.contains(s[i]))){
                l1.add(a[i]);
                l2.add(s[i]);
            }
        }
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<l1.size();j++){
                if(a[i]==l1.get(j) && s[i].equals(l2.get(j))){
                    c=1;
                    break;
                }
            }
            if(c==0){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
	  }
}
