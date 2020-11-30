import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),sum=0L;
        for(int i=0;i<n;i++){
            char[] c=sc.next().toCharArray();
            sum+=Long.parseLong(new String(c).substring(0,c.length/2))+Long.parseLong(new String(c).substring(c.length/2));
        }
        System.out.print(sum);
	}
}
