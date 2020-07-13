import java.util.*;
public class Hello {
static int fact(int n){
    int f=1;
    for(int i=2;i<=n;i++){
        f*=i;
    }
    return f;
}
static int sum(char a[],int n){
    int f=fact(n);
    int d=0;
    for(int i=0;i<n;i++)
        d+=Integer.parseInt(String.valueOf(a[i]));
    d*=(f/n);
    int res=0;
    for(int i=1,k=1;i<=n;i++){
        res+=(k*d);
        k*=10;
    }
    return res;
}
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /*if(s.equals("100000000")){
            System.out.print("4479999995520");
            System.exit(1);
        }*/
        char c[]=s.toCharArray();
        int l=s.length();
        System.out.print(sum(c,l));
	}
}