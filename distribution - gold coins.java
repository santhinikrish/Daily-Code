/*input: 5
10 20 45 32 16
output:
11 21 41 33 17

input: 6
10 15 25 45 90 18
output:
11 16 26 46 85 19

input: 10
1 2 3 4 6 1 2 3 4 1
output:
1 3 4 5 0 2 3 4 4 1
*/



import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=0,h=0;
        for(int i=0;i<n;i++){
            if(a[i]>m){
                m=a[i];
                h=i;
            }
        }
        for(int i=h-1,j=h+1;i>=0&&j<n;){
            if(i==0 && j<n-1 && a[h]!=0){
                a[j]+=1;
                a[h]--;
                j++;
            }
            else if(j==n-1 && a[h]!=0 && i>0){
                a[i]+=1;
                a[h]--;
                i--;
            }
            else if(i==0 && j==n){
                break;
            }else{
                a[i]+=1;
                a[j]+=1;
                a[h]-=2;
                i--;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
	}
}