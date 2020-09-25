/*
Example Input/Output 1:
Input:
500
50
Output: 29220
Explanation:
The size of the file is 500 MB.
The data rate is 50 KB/Sec.
After converting 500 MB into KB, it becomes 512000 KB.
So the total time to download the file is 10240 seconds.
1 - 500 seconds, the cost is 500 paise.
501 - 1000 seconds, the cost is 1000 paise.
> 1000 seconds, the cost is 27720 paise.
The total cost is 29220 (27720 + 1000 + 500).

Example Input/Output 2:
Input:
2
22
Output: 94
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(),m=sc.nextInt();
        long n=(long)Math.ceil((s*1024.0)/m),r=1,sum=0;
        while(r<=n){
            if(r<=500){
                sum+=1;r++;
            }else if(r>500 && r<=1000){
                sum+=2;r++;
            }else{
                sum+=3;r++;
            }
        }
        System.out.print(sum);
	}
}
