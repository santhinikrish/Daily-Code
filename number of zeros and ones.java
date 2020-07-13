/*input: 210056
output: yes
expla: 1st digit should be the count of 0 and 2nd digit should be the count of 1.
*/



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        int c1=0,c2=0;
        for(int i=0;i<c.length;i++){
            int a=Integer.parseInt(String.valueOf(c[i]));
            if(a==1){
                c1++;
            }
            else if(a==0){
                c2++;
            }
        }
        if(Integer.parseInt(String.valueOf(c[0]))==c2 && Integer.parseInt(String.valueOf(c[1]))==c1){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
	}
}