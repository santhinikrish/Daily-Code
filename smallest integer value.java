/*
Example Input/Output 1:
Input: 6
1 2 4 9 5 1
Output: 23
Explanation:
The integer 1 is not possible as 1 is present in the given 6 integers.
The integer 2 is not possible as 2 is present in the given 6 integers.
The integer 3 is not possible as 1 and 2 are present in the given 6 integers.
The integer 4 is not possible as 4 is present in the given 6 integers.
The integer 5 is not possible as 5 is present in the given 6 integers.
The integer 6 is not possible as 1 and 5 are present in the given 6 integers.
Similarly, up to 22 is not possible, because there is a combination that provides the same value.
The smallest integer value which is not equal to the sum of any combination of integers among the given 6 integers is 23.
So 23 is printed as the output.

Example Input/Output 2:
Input: 5
17 9 15 2 4
Output: 1
*/

import java.util.*;
class Hello
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int spos=1;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=0;i<n;i++){
      if(a[i]<=spos){
        spos+=a[i];
      }else{
        break;
      }
    }
    System.out.print(spos);
  }
}
