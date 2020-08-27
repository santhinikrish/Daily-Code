/*
Example Input/Output 1:
Input:
Welcome to skillrack
Output:
Welcome skillrack to
Explanation: Here S = "Welcome to skillrack" .
After sorting the words based on the last character, the string becomes "Welcome skillrack to" .
Hence the output is Welcome skillrack to

Example Input/Output 2:
Input:
WE WENT TO THE TEMPLE YESTERDAY
Output:
WE THE TEMPLE TO WENT YESTERDAY
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                String s=a[j],e=a[j-1];
                if(e.charAt(e.length()-1) > s.charAt(s.length()-1)){
                    String t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
	  }
}
