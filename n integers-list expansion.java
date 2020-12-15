/*
Example Input/Output 1:
Input:
15 4
Output:
1 2 3 4 3 4 5 3 5 6 5 6 7 4 5
Explanation:
Here X = 4, so the list contains 1, 2, 3 and 4.
The 1st integer is 1. So the list formed by adding the value 1 to all the remaining integers is given below.
3 4 5
After adding the above integers to the orginal list, it becomes 1 2 3 4 3 4 5.
The 2nd integer is 2. So the list formed by adding the value 2 to all the remaining integers is given below.
3 5 6 5 6 7
After adding the above integers to the orginal list, it becomes 1 2 3 4 3 4 5 3 5 6 5 6 7.
The 3rd integer is 3. So the list formed by adding the value 3 to all the remaining integers is given below.
4 5 7 6 7 8 6 8 9 8 9 10
After adding the above integers to the orginal list, it becomes 1 2 3 4 3 4 5 3 5 6 5 6 7 4 5 7 6 7 8 6 8 9 8 9 10.
Now the number of integers in the orginal list is greater than 15.
So the first 15 integers are printed as the output.

Example Input/Output 2:
Input:
20 3
Output:
1 2 3 3 4 3 5 5 6 4 5 6 7 6 8 8 9 4 5 6
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=1;i<=x;i++) l.add(i);
        for(int i=0;i<l.size();i++){
            int s=l.size();
            for(int j=0;j<s;j++){
                if(i!=j) l.add(l.get(j)+l.get(i));
            }
            if(l.size()>n) break;
        }
        for(int i=0;i<n;i++){
            System.out.print(l.get(i)+" ");
        }
	}
}
