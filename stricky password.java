/*
Boundary Condition(s):
1 <= Length of P <= 100

Input Format:
The first line contains P.

Output Format:
The first line contains a string value based on the given conditions.

Example Input/Output 1:
Input: Qwerty@123
Output: STRONG
Explanation:
Here the password Qwerty@123 satisfied all the four rules.
So STRONG is printed as the output.

Example Input/Output 2:
Input: Q$1a
Output: WEAK
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {8
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int low=0,upp=0,spl=0,dig=0,count=0;
        for(int i=0;i<s.length;i++){
            if(Character.isLowerCase(s[i])){
                low++;count++;
            }else if(Character.isUpperCase(s[i])){
                upp++;count++;
            }else if(Character.isDigit(s[i])){
                dig++;count++;
            }else{
                spl++;count++;
            }
        }
        if(s.length>=8 && low>=1 && upp>=1 && dig>=1 && spl>=1){
            System.out.print("STRONG");
        }else if((s.length>=8 && (low>=1 && upp>=1) && dig>=1) || (s.length>=8 && (low>=1 && upp>=1) && spl>=1) || (s.length>=8 && dig>=1 && spl>=1)){
            System.out.print("GOOD");
        }
        else if((s.length>=8 && (low>=1 || upp>=1)) || (dig>=1 && s.length>=8) || (s.length>=8 && spl>=1)){
            System.out.print("MEDIUM");
        }else {
            System.out.print("WEAK");
        }
	}
}
