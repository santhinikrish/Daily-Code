/*
Example Input/Output 1:
Input:
4
1
6
3
4
Output:
5 9
Explanation:
The player A rolls the die and gets 1.
The player B rolls the die and gets 6 and gets another chance to roll the die, so the player B rolls the die and gets 3.
The player A rolls the die and gets 4.
The total points earned by the player A is 5 (1 + 4).
The total points earned by the player B is 9 (6 + 3).
Hence the output is 5 9

Example Input/Output 2:
Input:
5
1
5
4
6
4
Output:
5 15
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pos=1,sum1=0,sum2=0;
		for(int i=0;i<n;i++){
		    int num=sc.nextInt();
		    if(pos%2!=0){
		        sum1+=num;
		        if(num!=6){
		            pos++;
		        }
		    }else{
		        sum2+=num;
		        if(num!=6){
		            pos++;
		        }
		    }
		}
		System.out.print(sum1+" "+sum2);
	}
}
