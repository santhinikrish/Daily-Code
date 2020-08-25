import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=l[i]*b[i];
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(c[j-1]>c[j]){
                    int t=c[j-1];
                    c[j-1]=c[j];
                    c[j]=t;
                    int t1=l[j-1];
                    l[j-1]=l[j];
                    l[j]=t1;
                    int t2=b[j-1];
                    b[j-1]=b[j];
                    b[j]=t2;
                }else if(c[j-1]==c[j]){
                    if(l[j-1]>l[j]){
                        int r=c[j-1];
                        c[j-1]=c[j];
                        c[j]=r;
                        int t2=l[j-1];
                        l[j-1]=l[j];
                        l[j]=t2;
                        int t1=b[j-1];
                        b[j-1]=b[j];
                        b[j]=t1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(l[i]+" "+b[i]+" "+c[i]);
        }
	}
}
