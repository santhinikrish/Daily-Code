/*input: 7
5 1 3 6 7 2 4
output: yes
expla: 3,4,5 where 3^2+4^2=5^2(9-16=25)
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p=0;
        for(int i=0;i<n;i++){
            int f=a[i];
            for(int j=0;j<n;j++){
                int g=a[j];
                for(int k=0;k<n;k++){
                    int m=a[k];
                    if(((f*f)+(g*g))==m*m)
                    {
                        //p=1;
                        System.out.print("Yes");
                        System.exit(1);
                    }
                }
            }
        }
        System.out.print("No");
	}
}