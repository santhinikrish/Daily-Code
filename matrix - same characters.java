/*input: 5
z a a a z
a z a z a
a a z a a
a z a z a
z a a a z
output: YES
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        Set<Character> b=new HashSet<Character>();
        Set<Character> c=new HashSet<Character>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==(n-1)){
                   b.add(a[i][j]);
                }else{
                    c.add(a[i][j]);
                }
            }
        }
        if(b.size()==1 && c.size()==1) {
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
	}
}