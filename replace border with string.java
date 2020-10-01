/*
Example Input/Output 1:
Input:
4 5
@ b c d E
e f 5 h i
b c d e q
k 9 o l 2
queenbee
Output:
q u e e n
e f 5 h b
b c d e e
k 9 o l e
Explanation:
The characters in the border of the matrix are highlighted below.
@ b c d E
e f 5 h i
b c d e q
k 9 o l 2
So the characters in the border are replaced with the characters in the given string in the clockwise direction.
Here the length of the string (8) is less than the number of characters in the borders (14).
So the last 6 characters in the border of the matrix remain unchanged.
Hence the output is
q u e e n
e f 5 h b
b c d e e
k 9 o l e

Example Input/Output 2:
Input:
3 3
A b c
d * f
g h i
d@$zling
Output:
d @ $
g * z
n i l
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char c[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=sc.next().charAt(0);
            }
        }
        char s[]=sc.next().toCharArray();int k=0,p=0;
        for(int i=0;i<m;i++){
            if(k<s.length)
            c[0][i]=s[k++];
        }
        for(int i=1;i<n;i++){
            if(k<s.length)
            c[i][m-1]=s[k++];
        }
        for(int i=m-2;i>=0;i--){
            if(k<s.length)
            c[n-1][i]=s[k++];
        }
        for(int i=n-2;i>0;i--){
            if(k<s.length)
            c[i][0]=s[k++];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
	  }
}
