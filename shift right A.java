/*
Example Input/Output 1:
Input:
4 6
A B A A B B
A A A A A A
B B A A A A
A A A A B A
Output:
- - - A A A
A A A A A A
- - A A A A
- A A A A A
Explanation:
After removing all the occurrences of B, the empty cells are replaced with hyphens.
A - A A - -
A A A A A A
- - A A A A
A A A A - A
After shifting the occurrences of A to the right, the matrix becomes
- - - A A A
A A A A A A
- - A A A A
- A A A A A

Example Input/Output 2:
Input:
5 5
B B A B B
A B A B A
A A B B B
B B A A A
B B B B A
Output:
- - - - A
- - A A A
- - - A A
- - A A A
- - - - A
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char s[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<m;j++)
            {
                s[i][j]=sc.next().charAt(0);
                if(s[i][j]=='B')
                {
                    c++;
                    s[i][j]='A';
                }
            }
            for(int j=0;j<c;j++)
            {
                s[i][j]='-';
            }
        }
        for(int i=0;i<n;i++,System.out.println())
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(s[i][j]+" ");
            }
        }
	}
}
