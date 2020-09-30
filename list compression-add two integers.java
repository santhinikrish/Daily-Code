/*
Example Input/Output 1:
Input:
10 20 15 25 30
Output:
10 15 20 25 30
25 45 30
70 30
100
Explanation:
The integers in the given list are 10 20 15 25 30.
After sorting the integers in the list, it becomes 10 15 20 25 30.
After the 1st compression, the list becomes 25 45 30 (10+15, 20+25, 30).
After the 2nd compression, the list becomes 70 30 (25+45, 30).
After the 3rd compression, the list becomes 100 (70+30).
Now the number of integers in the list is 1.

Example Input/Output 2:
Input:
12 45 79 8 23 78
Output:
8 12 23 45 78 79
20 68 157
88 157
245
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int c[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            System.out.print(a[i]+" ");
            c[i]=a[i];
        }
        System.out.println();
        int k=0,o=0,p=s.length;
        if(s.length%2!=0) o=s.length/2+1;
        else o=s.length/2;
        for(int y=0;y<o;y++){
            for(int i=0;i<p;i+=2){
                int sum=0;
                if(p%2!=0 && i==p-1){
                    System.out.print(c[i]);
                    c[k++]=c[i];
                    break;
                }
                sum+=c[i]+c[i+1];
                System.out.print(sum+" ");
                c[k++]=sum;
            }
            p=k;
            k=0;
            System.out.println();
        }
	}
}
