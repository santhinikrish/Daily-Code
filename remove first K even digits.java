/*input: 5 7
1963 2937 544 2673 2350
outout: 1558
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sum=0,count=0;
        for(int j=0;j<n;j++){
            String s=sc.next();
            char c[]=s.toCharArray();
            String r="";
            for(int i=0;i<c.length;i++){
                if((c[i]-'0')%2==0 && count!=k){
                    count++;
                }else{
                    r+=c[i];
                }
            }
            if(r.length()!=0){
                int fin=Integer.parseInt(r);
                sum+=fin;
            }
        }
        System.out.print(sum);
	}
}