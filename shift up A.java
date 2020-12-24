/*
Example Input/Output 1:
Input:
3 4
A A B A
B B A A
A B A A
Output:
A A A A
A - A A
- - - A
Explanation:
After removing all the occurrences of B, the empty cells are replaced with the hyphens.
A A - A
- - A A
A - A A
After shifting the occurrences of A to the top, the matrix becomes
A A A A
A - A A
- - - A

Example Input/Output 2:
Input:
6 5
B A B A A
A A A A A
B A B A A
B B B B A
A A B A B
A A B B A
Output:
A A A A A
A A - A A
A A - A A
- A - A A
- A - - A
- - - - -
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.next().charAt(0);
        for(int i=0;i<m;i++){
            int c=0,k=n-1;
            for(int j=0;j<n;j++)
            {
                if(a[j][i]=='B') c++;
            }
            while(c-->0 && k>=0)
            {
                a[k--][i]='-';
            }
        }
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<m;j++){
                if(a[i][j]=='B')
                System.out.print("A ");
                else
                System.out.print(a[i][j]+" ");
            }
        }
	}
}
