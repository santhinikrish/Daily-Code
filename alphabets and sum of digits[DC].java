/*input1: A1B2c3d4E5
output: ABcdE15
input2: Skillrack314
output: Skillrack8
*/



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] c=s.toCharArray();
        int sum=0;
        for(int i=0;i<c.length;i++){
            if(Character.isLetter(c[i])){
                System.out.print(c[i]);
            }else if(Character.isDigit(c[i])){
                sum+=Integer.parseInt(String.valueOf(c[i]));
            }
        }
        System.out.print(sum);
	}
}
