/*
Example Input/Output 1:
Input:
a
Good
Alice is a Good girl she is a Good student
Output:
girl student
Explanation: Here W1 = a and W2 = Good.
The words that occur immediately after W1 and W2 in the string S are girl and student.
Hence the output is girl student

Example Input/Output 2:
Input:
louder
speak
Actions speak louder than words
Output: -1

Example Input/Output 3:
Input:
man
has
every man has his price
Output:
his
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();
        sc.nextLine();int p=0;
        String s[]=sc.nextLine().split(" ");
        for(int i=0;i<s.length-2;i++){
            if(s[i].equals(a) && s[i+1].equals(b)){
                System.out.print(s[i+2]+" ");p=1;
            }
        }
        if(p==0) System.out.print("-1");
	}
}
