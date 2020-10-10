/*
Example Input/Output 1:
Input: 3
Output:
1
1
2 1
1
1
2 1
3 2 1
2 1
1
Explanation:
Here N = 3, so 3 triangles are printed.
First Triangle:
1
Second Triangle:
1
2 1
1
Third Triangle:
1
2 1
3 2 1
2 1
1

Example Input/Output 2:
Input: 4
Output:
1
1
2 1
1
1
2 1
3 2 1
2 1
1
1
2 1
3 2 1
4 3 2 1
3 2 1
2 1
1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int p=1;
            for(int j=1;j<i*2;j++){
                for(int k=p;k>=1;k--){
                    System.out.print(k+" ");
                }
                System.out.println();
                if(j<i) p++;
                else p--;
            }
        }
	}
}
