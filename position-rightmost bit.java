import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int x,y,count=0,c=0,p=0;
        x=sc.nextInt();
        y=sc.nextInt();
        String a=Integer.toBinaryString(x);
        String b=Integer.toBinaryString(y);
        int i,j,l1=a.length();
        int l2=b.length();
        for(i=l1-1,j=l2-1;i>=0 && j>=0;i--,j--)
        {
            if(a.charAt(i)!=b.charAt(j)){
                count++;
            }
            if(a.charAt(i)==b.charAt(j)){
                c++;
            }
            if(count==1){
                System.out.print(c+1);
                p=1;
                break;
            }
        }
        if(p==0){
            System.out.print("-1");
        }
	}
}