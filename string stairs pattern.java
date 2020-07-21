/*
Example Input/Output 1:
Input:
receiving
Output:
--------r
-------re
------rec
-----rece
----recei
---receiv
--receivi
-receivin
receiving
eceiving
ceiving
eiving
iving
ving
ing
ng
g
Explanation:
The length of the given string receiving is 9.
So the pattern contains (9*2)-1 lines.
In line 1, 8 hyphens and the first alphabet in S are printed.
In line 2, 7 hyphens and the first two alphabets in S are printed.
In line 3, 6 hyphens and the first three alphabets in S are printed.
Similarly, the first 9 lines are printed.
--------r
-------re
------rec
-----rece
----recei
---receiv
--receivi
-receivin
receiving
In line 10, the string S is printed except the first alphabet.
In line 11, the string S is printed except the first two alphabets.
In line 12, the string S is printed except the first three alphabets.
Similarly, the remaining lines are printed.
eceiving
ceiving
eiving
iving
ving
ing
ng
g

Example Input/Output 2:
Input: ZERO
Output:
---Z
--ZE
-ZER
ZERO
ERO
RO
O

Example Input/Output 3:
Input: KeyBoard
Output:
-------K
------Ke
-----Key
----KeyB
---KeyBo
--KeyBoa
-KeyBoar
KeyBoard
eyBoard
yBoard
Board
oard
ard
rd
d
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray();
        int n=s.length,d=0;
        for(int i=0;i<n;i++){
            d++;
            int j,l=0,u=0;
            for(j=0;j<n-i-1;j++){
                System.out.print("-");
            }
            while(l<d){
                l++;
                System.out.print(s[u++]);
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(s[j]);
            }
            System.out.println();
        }
	}
}
