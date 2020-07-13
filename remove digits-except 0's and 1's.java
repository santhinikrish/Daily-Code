/*input: 1204571
output: 5
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a="";
        int p=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'||s.charAt(i)=='0'){
                a+=s.charAt(i);
                p=1;
            }
        }
        if(p==1){
            System.out.print(Integer.parseInt(a,2));
        }else{
            System.out.print("-1");
        }
	}
}