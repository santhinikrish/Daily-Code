/*
Example Input/Output 1:
Input: 5 8 10
Output: eifkgmhojq
Explanation:
The 26 lower case alphabets are abcdefghijklmnopqrstuvwxyz.
M = 5, N = 8 and K = 10.
Here we need to form a string of length 10.
1st alphabet of S = 5th lower case alphabet e. Now the remaining lower case alphabets are abcdfghijklmnopqrstuvwxyz.
2nd alphabet of S = 8th lower case alphabet i. Now the remaining lower case alphabets are abcdfghjklmnopqrstuvwxyz.
3rd alphabet of S = 5th lower case alphabet f. Now the remaining lower case alphabets are abcdghjklmnopqrstuvwxyz.
4th alphabet of S = 8th lower case alphabet k. Now the remaining lower case alphabets are abcdghjlmnopqrstuvwxyz.
Similarly, the remaining 6 alphabets of S are formed using the remaining lower case alphabets.
The string S is eifkgmhojq, which is printed as the output.

Example Input/Output 2:
Input: 30 27 5
Output: dbhfl
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        ArrayList<String> l=new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        for(int i=0;i<k;i++){
            if(i%2==0) System.out.print(l.remove((n-1)%l.size()));
            else System.out.print(l.remove((m-1)%l.size()));
        }
	  }
}
