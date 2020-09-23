/*
Example Input/Output 1:
Input:
NOTEBOOKPAPER
Output:
N-O-TEBOOKPAP-E-R
NOT-E-BOOKP-A-PER
NOTEB-O--O-KPAPER
NOTEB-O--O-KPAPER
NOT-E-BOOKP-A-PER
N-O-TEBOOKPAP-E-R
Explanation:
The number of vowels in the given string NOTEBOOKPAPER is 6.
So 6 lines are printed in the output.
N-O-TEBOOKPAP-E-R
NOT-E-BOOKP-A-PER
NOTEB-O--O-KPAPER
NOTEB-O--O-KPAPER
NOT-E-BOOKP-A-PER
N-O-TEBOOKPAP-E-R

Example Input/Output 2:
Input:
Elevation
Output:
-E-levati-o-n
El-e-vat-i-on
Elev-a-tion
El-e-vat-i-on
-E-levati-o-n
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int count=0;
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            if(isVow(s[i])) a[count++]=i;
        }
        int k=0,l=count-1;
        for(int i=0;i<count;i++){
            for(int j=0;j<s.length;j++){
                if(j==a[k] || j==a[l])
                System.out.print("-"+s[j]+"-");
                else
                System.out.print(s[j]);
            }
            k++;l--;
            System.out.println();
        }
    }
    public static boolean isVow(char s){
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U'){
            return true;
        }
        return false;
	}
}
