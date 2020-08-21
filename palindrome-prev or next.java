/*
Example Input/Output 1:
Input: afdc
Output: YES
Explanation:
Here the string is afdc. The first alphabet 'a' is replaced with 'b'.
The second alphabet 'f' can be replaced with either 'e' or 'g'.
To get the palindromic string, it must be replaced with 'e'.
The third alphabet 'd' can be replaced with either 'c' or 'e'.
To get the palindromic string, it must be replaced with 'e'.
The fourth alphabet 'c' can be replaced with 'b' or 'd'.
To get the palindromic string, it must be replaced with 'b'.
Now the string becomes beeb which is a palindrome. So YES is printed as the output.

Example Input/Output 2:
Input: bdhajzicb
Output: NO

Example Input/Output 3:
Input: azAZGuwEYByb
Output: YES
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length;
        for(int i=0,j=l-1;i<j;i++,j--){
            char start=s[i];
            char end=s[j];
            if(!(start==end||start==end+1||start==end-1||end==start+1||end==start||start+1==end+1||start-1==end-1||start+1==end-1||start-1==end+1)){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
	}
}


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] str=sc.nextLine().toCharArray();
		int len=str.length,flag=0;
		for(int index=0;index<len/2;index++){
		    char ch1=str[index],ch2=str[len-index-1];
		    if(Math.abs(ch1-ch2)>2){
		        System.out.print("NO");
		        flag=1;
		        break;
		    }
		}
		if(flag==0){
		    System.out.print("YES");
		}

	}
}
