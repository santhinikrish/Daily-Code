/
/*
Example Input/Output 1:
Input:
skill 3
skillrack helps students to succeed
Output:
skill helps students to succeed
Explanation:
Here W = skill and K = 3.
The first three characters in W are ski.
The only word that has the first three characters as ski in the string "skillrack helps students to succeed" is skillrack.
So it is replaced with skill.
Hence the output is skill helps students to succeed
Example Input/Output 2:
Input:
happy 4
WORK HAPPENS TO LIVE HAPPIER NOT TO HATE
Output:
WORK happy TO LIVE happy NOT TO HATE
Example Input/Output 3:
Input:
#5467 2
@abcd #521A
Output:
@abcd #5467
*/
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=sc.nextLine().split(" ");
        String t=s.substring(0,n);
        for(int i=0;i<a.length;i++){
            if(a[i].length()>=n){
                if(t.equalsIgnoreCase(a[i].substring(0,n))){
                    System.out.print(s+" ");
                }else{
                    System.out.print(a[i]+" ");
                }
            }else{
                System.out.print(a[i]+" ");
            }
        }
    }
}
