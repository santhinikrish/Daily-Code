/*
Example Input/Output 1:
Input: 50
Output:
50 10 25 5 2 1
Explanation:
The factors of 50 are 1, 2, 5, 10, 25 and 50.
The integer 1 has 1 factor. The integer 2 has 2 factors.
The integer 5 has 2 factors.
The integer 10 has 4 factors.
The integer 25 has 3 factors.
The integer 50 has 6 factors.
 Here 2 and 5 have the same number of factors.
 So they are sorted in descending order.
 After sorting the factors of 50 in descending order based on their factors count, the factors become 50 10 25 5 2 1.
 So they are printed as the output.

 Example Input/Output 2:
 Input: 455
 Output:
 455 91 65 35 13 7 5 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[500000];
        int b[]=new int[500000];
        int k=0,l=0;
        for(int i=n;i>=1;i--){
            if(n%i==0){
                int t=i,c=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        c++;
                    }
                }
                a[k++]=c;
                b[l++]=t;
            }
        }
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(a[i]<a[j]){
                    int t1=a[i];
                    a[i]=a[j];
                    a[j]=t1;
                    int t2=b[i];
                    b[i]=b[j];
                    b[j]=t2;
                }else if(a[i]==a[j]){
                    if(b[i]<b[j]){
                      int y=b[i];
                      b[i]=b[j];
                      b[j]=y;
                    }
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(b[i]+" ");
        }
	}
}
