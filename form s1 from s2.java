/*
Example Input/Output 1:
Input:
Laptop
lapoLptpAtpLoaKs
2
Output: YES
Explanation:
Here X=2, the string S1 is Laptop and the string S2 is lapoLptpAtpLoaKs.
The string Laptop can be formed from the alphabets of lapoLptpAtpLoaKs for 2 times.
Hence the output is YES

Example Input/Output 2:
Input:
CONTINENT
CpTkOiNqunptsNe
1
Output: NO

Example Input/Output 3:
Input:
Abc#123
a#cE#23pb1bA12AcLK13LAb#32cP
3
Output: YES
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),d="";
        char b[]=sc.next().toCharArray();
        int n=sc.nextInt();
        for(int i=0;i<a.lsength();i++){
            int k=0;
            for(int j=0;j<b.length;j++){
                if(a.charAt(i)==b[j] && b[j]!=' '){
                    if(k==n) break;
                    k++;
                    b[j]=' ';
                }
            }
            if(k>=n)
            d+=a.charAt(i);
        }
        if(a.equals(d))
        System.out.print("YES");
        else
        System.out.print("NO");
	}
}
