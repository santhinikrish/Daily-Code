/*
Example Input/Output 1:
Input: 98 125
Output:
100 101 102 103 104 105 106 107 108 109 110 120
Explanation: Here X = 98 and Y = 125.
The integers from 98 to 125 having at least one zero are 100 101 102 103 104 105 106 107 108 109 110 120.
Hence the output is 100 101 102 103 104 105 106 107 108 109 110 120

Example Input/Output 2:
Input: 1351 1358
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int flag=0;
        for(int i=start;i<=end;i++){
            int count=0;
            String bet=Integer.toString(i);
            for(int j=0;j<bet.length();j++){
                if(bet.charAt(j)=='0'){
                    count++;
                }
            }
            if(count>0){
                System.out.print(bet+" ");
                flag=1;
            }
        }
        if(flag==0){
            System.out.print("-1");
        }
	}
}
