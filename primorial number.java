/*
Example Input/Output 1:
Input: 3
Output: 30
Explanation: The first 3 prime integers are 2, 3 and 5.
So their product 30 (2 * 3 * 5) is printed as the output.

Example Input/Output 2:
Input: 5
Output: 2310
*/


import java.util.*;
public class Hello {
    static boolean isPrime(int a){
        if(a==2){
            return true;
        }else if(a%2==0){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,i=2;
        long pro=1;
        while(c<n){
            if(isPrime(i)){
                c++;
                pro*=i;
            }
            i++;
        }
        System.out.print(pro);
  	}
}
