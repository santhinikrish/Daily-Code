/*
Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains the string value "Profit" or "Loss" followed by the profit or loss amount or the string value "No Profit No Loss" .

Example Input/Output 1:
Input:
6
84 77 72 58 23 25
Output:
Profit 1
Explanation:
The cost price of the 6 items are 84, 77, 72, 58, 23 and 25.
The selling price of the 6 items are 85, 75, 70, 60, 25 and 25.
The total cost price is 339.
The total selling price is 340.
So the shopkeeper makes a profit of 1 rupee.
Hence the output is Profit 1

Example Input/Output 2:
Input:
3
152 96 100
Output:
Loss 3
Explanation:
The cost price of the 3 items are 152, 96 and 100.
The selling price of the 3 items are 150, 95 and 100.
The total cost price is 348.
The total selling price is 345.
So the shopkeeper suffers a loss of 3 rupees.
Hence the output is Loss 3

Example Input/Output 3:
Input:
5
15 20 5 16 19
Output:
No Profit No Loss
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),cost=0,sell=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt(),k=0,p=0;
            cost+=a;
            int u=a%5;
            if(u>0 && u<=2 || u>=6 && u<=7){
                while(true){
                    a--;
                    if(a%5==0) break;
                }
            }
            else if(u>=8 && u<=9 || u>=3 && u<5){
                while(true){
                    a++;
                    if(a%5==0) break;
                }
            }
            sell+=a;
        }
        int tot=sell-cost;
        if(tot>0)
            System.out.print("Profit "+tot);
        else if(tot<0)
            System.out.print("Loss "+(tot*-1));
        else
            System.out.print("No Profit No Loss");
	}
}
