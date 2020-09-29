/*
Example Input/Output 1:
Input:
7
6844 25171 53677 18072 26457 70816 59225
Output:
70816 18072 25171 59225 26457 53677 6844
Explanation:
The smallest digit in 6844 is 4.
The smallest digit in 25171 is 1.
The smallest digit in 53677 is 3.
The smallest digit in 18072 is 0.
The smallest digit in 26457 is 2.
The smallest digit in 70816 is 0.
The smallest digit in 59225 is 2.
After sorting the integers based on the smallest digit in each integer, the integers become 70816, 18072, 25171, 59225, 26457, 53677 and 6844.
Hence the output is 70816 18072 25171 59225 26457 53677 6844

Example Input/Output 2:
Input:
5
7287 9836 47 76 99234
Output:
99234 7287 9836 47 76
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
            char c[]=a[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            b[i]=s.charAt(0)-'0';
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(b[j-1]>b[j]){
                    int e=b[j-1];
                    b[j-1]=b[j];
                    b[j]=e;
                    String t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }else if(b[j-1]==b[j]){
                    int r=Integer.parseInt(a[j-1]),w=Integer.parseInt(a[j]);
                    if(r<w){
                        int y=r;
                        r=w;
                        w=y;
                    }
                    a[j]=r+"";
                    a[j-1]=w+"";
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
	}
}
