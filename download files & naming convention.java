/*
Example Input/Output 1:
Input:
7
mybio.txt
profile.jpeg
mybio.txt
mybio.txt
profile.pdf
profile.jpeg
mybio.odt
Output:
mybio.txt
profile.jpeg
mybio(1).txt
mybio(2).txt
profile.pdf
profile(1).jpeg
mybio.odt
Explanation:
The name of the 1st file is "mybio.txt" . So it is downloaded with the same name "mybio.txt" .
The name of the 2nd file is "profile.jpeg" . So it is downloaded with the same name "profile.jpeg" .
The name of the 3rd file is "mybio.txt" . So it is downloaded with the name "mybio(1).txt" (Downloaded again for the 1st time).
The name of the 4th file is "mybio.txt" . So it is downloaded with the name "mybio(2).txt" (Downloaded again for the 2nd time).
The name of the 5th file is "profile.pdf" . So it is downloaded with the same name "profile.pdf" .
The name of the 6th file is "profile.jpeg" . So it is downloaded with the name "profile(1).jpeg" (Downloaded again for the 1st time).
The name of the 7th file is "mybio.odt" . So it is downloaded with the same name "mybio.odt" .

Example Input/Output 2:
Input:
6
book.png
book.txt
mydoc.docx
book.txt
mydoc.pdf
book.txt
Output:
book.png
book.txt
mydoc.docx
book(1).txt
mydoc.pdf
book(2).txt
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<i;j++){
                if(a[i].equals(a[j]))
                    c++;
            }
            if(c==0) System.out.println(a[i]);
            else{
                String s=a[i];
                System.out.println(s.substring(0,s.indexOf('.'))+"("+c+")."+s.substring(s.indexOf('.')+1));
            }
        }
	  }
}
