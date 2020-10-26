/*
Example Input/Output 1:
Input: 58
Output: CG
Explanation: Here N = 58.
Iteration 1: R = 58 % 26 = 6. So the 7th upper case alphabet is G.
Now N becomes 2 (58 / 26).
Iteration 2: R = 2 % 26 = 2. So the 3rd upper case alphabet is C.
Now N becomes 0 (2 / 26).
The string S becomes GC. So the reverse of S is printed as the output.

Example Input/Output 2:
Input: 1000
Output: BMM
Explanation: Here N = 1000.
Iteration 1: R = 1000 % 26 = 12. So the 13th upper case alphabet is M.
Now N becomes 38 (1000 / 26).
Iteration 2: R = 38 % 26 = 12. So the 13th upper case alphabet is M.
Now N becomes 1 (38 / 26).
Iteration 3: R = 1 % 26 = 1. So the 2nd upper case alphabet is B.
Now N becomes 0 (1 / 26).
The string S becomes MMB. So the reverse of S is printed as the output.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n;
        StringBuffer s=new StringBuffer();
        while(t>0){
            int r=t%26;
            s.append((char)(r+65));
            t/=26;
        }
        System.out.print(s.reverse());
	}
}
