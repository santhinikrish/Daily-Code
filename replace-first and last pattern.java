/*
Example Input/Output 1:
Input: environment
Output:
nvironmen
evironmet
enironmnt
envronent
envioment
envirnment
Explanation:
The length of the string environment is 11.
So the pattern contains 6 ((11+1)/2 = 6) lines of output.
In the first line, the string S is printed except the first and last characters(e and t).
nvironmen
In the second line, the string S is printed except the second and last but one characters(n and n).
evironmet
Similarly, the remaining possible string values are printed.
enironmnt
envronent
envioment
envirnment

Example Input/Output 2:
Input: Robotics
Output:
obotic
Rbotis
Rootcs
Robics
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int n=0,l=(s.length+1)/2;
        int i=0,j=s.length-1;
        while(n<l){
            for(int k=0;k<s.length;k++){
                if(k==i || k==j){
                    continue;
                }else{
                    System.out.print(s[k]);
                }
            }
            i++;j--;n++;
            System.out.println();
        }
	}
}
