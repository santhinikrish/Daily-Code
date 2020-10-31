/*
Example Input/Output 1:
Input:
this_is_variable
Output:
thisIsVariable
Explanation:
The given variable name "this_is_variable" contains '_'.
After modifying the variable name as per the given condition, the variable name becomes "thisIsVariable"
Hence the output is thisIsVariable

Example Input/Output 2:
Input:
thisIsVariable
Output:
this_is_variable

Example Input/Output 3:
Input:
max_sum
Output:
maxSum
*/
import java.util.*;
class Hello
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char c[]=s.toCharArray();
    System.out.print(toggleNamingConvention(c));
  }
public static char[] toggleNamingConvention(char[] str) {
    int k=0;
    char c[]=new char[10001];
    for(int i=0;i<str.length;i++){
        if(str[i]=='_'){
            i++;
            c[k++]=Character.toUpperCase(str[i]);
        }else if(Character.isUpperCase(str[i])){
            c[k++]='_';
            c[k++]=Character.toLowerCase(str[i]);
        }
        else{
            c[k++]=str[i];
        }
    }
    char a[]=new char[k];
    for(int i=0;i<k;i++) a[i]=c[i];
    return a;
}
}
