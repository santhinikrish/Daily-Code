/*
Boundary Condition(s):
6 <= Length of S <= 7 1 <= K <= 9999

Input Format:
The first line contains the registration number S.
The second line contains K.

Output Format:
The first line contains the Kth registration number from the given registration number.

Example Input/Output 1:
Input:
TM-9980
40
Output:
TN-0021
Explanation:
The given registration number is TM-9980.
The 40th registration number from TM-9980 is TN-0021.
So TN-0021 is printed as the output.

Example Input/Output 2:
Input:
Z-8980
1779
Output:
AA-0760
*/

import java.util.*;
public class Hello {
    public static String getNextAlpha(String str)
    {
        String ch1="",ch2="";
        if(str.length()==1 && str.charAt(0)=='Z')
        {
            return "AA";
        }
        else if(str.length()==1)
        {
            return Character.toString(str.charAt(0)+1);
        }
        else{
            if(str.charAt(1)=='Z')
            {
                ch2="A";
                ch1=Character.toString(str.charAt(0)+1);
            }
            else
            {
                return Character.toString(str.charAt(0))+Character.toString(str.charAt(1)+1);
            }
        }
        return ch1+ch2;
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] regNum=scanner.next().split("-");
		int toAdd=scanner.nextInt();
		int actnum=Integer.parseInt(regNum[1]);
		if(actnum+toAdd>=10000)
		{
		System.out.print(getNextAlpha(regNum[0])+"-");
		System.out.print(String.format("%04d",(actnum+toAdd)%10000+1));
		}
		else{
		    System.out.print(regNum[0]+"-");
		    System.out.print(String.format("%04d",actnum+toAdd));
		}
	}
}
