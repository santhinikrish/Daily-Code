/*
Example Input/Output 1:
Input:
5 7
C m D k i t d
E t q C e o g
i A q q b c D
F y m z g g o
g h a l A l s
4 2
3 6
Output:
yhamqqDkCqzlAgbeitoc
Explanation:
In the given 5x7 character matrix, the characters from the cell (4, 2) to the cell (3, 6) in vertical zig-zag direction are highlighted below.
C m D k i t d
E t q C e o g
i A q q b c D
F y m z g g o
g h a l A l s
So yhamqqDkCqzlAgbeitoc is printed as the output.

Example Input/Output 2:
Input:
6 4
o h E t
2 w F q
b v y 9
s w 6 l
v s 9 E
s 2 6 0
1 2
6 3
Output:
hwvws26
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char c[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=sc.next().charAt(0);
            }
            sc.nextLine();
        }
        int x1=sc.nextInt()-1,y1=sc.nextInt()-1,x2=sc.nextInt()-1,y2=sc.nextInt()-1,p=0;
        while(true){
            if(x1>=0 && y1>=0 && x1<n && y1<m){
                System.out.print(c[x1][y1]);
            }
            if(x1==x2 && y1==y2) break;
            if(x1==n){
                y1++;
                p=1;
            }else if(x1==-1){
                y1++;p=0;
            }
            if(p==0) x1++;
            else x1--;
        }
	}
}
