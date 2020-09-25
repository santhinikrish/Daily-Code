/*
Example Input/Output 1:
Input:
5
6 17 32 18 11
Output:
6 11 32 17 18
Explanation:
The given 5 integers are 6, 17, 32, 18 and 11.
The reversed values of the 5 integers are 6, 71, 23, 81 and 11.
After sorting the given 5 integers based on the reversed value in ascending order, the integers become 6, 11, 32, 17 and 18.
Hence the output is 6 11 32 17 18

Example Input/Output 2:
Input:
6
29 50 18 76 84 300
Output:
300 50 84 76 18 29

Example Input/Output 3:
Input:
4
200 20 2000 2
Output:
200 20 2000 2
*/

import java.util.*;
public class Main {
    public static int rev(String a){
        StringBuffer s=new StringBuffer(a);
        return Integer.parseInt(s.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
            b[i]=rev(a[i]);
            c[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(b[j-1]>b[j]){
                    int t=b[j-1];
                    b[j-1]=b[j];
                    b[j]=t;
                    int e=c[j-1];
                    c[j-1]=c[j];
                    c[j]=e;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[c[i]]+" ");
        }
	}
}

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		ArrayList<Integer> b = new ArrayList<>();
		ArrayList<Integer> c = new ArrayList<>();
		for(int i=0;i<n;i++) {
		    a[i] = sc.nextInt();
		    int x = a[i],p = 0;
		    while(x!=0) {
		        p = (p*10) + x%10;
		        x /= 10;
		    }
		    b.add(p);
		    c.add(p);
		}
		Collections.sort(c);
		for(int i=0;i<n;i++) {
		    int x = b.indexOf(c.get(i));
		    System.out.print(a[x] + " ");
		    b.set(x,-1);
		}
	}
}
