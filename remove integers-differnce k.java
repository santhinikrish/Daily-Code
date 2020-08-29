import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int k=sc.nextInt();
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
		    int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if((a[j]-a[i])<=k){
                    int g=s.length-(j-i)-1;
                    if(g<min)
                    min=g;
                  }
             }
        }
        System.out.print(min);
	}
}
