/*input: Japan
output: J p n
input: fireFighter
output: f F g h t
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        int l=s.length(),p;
        for(int i=0;i<l;i++){
            p=0;
            if(c[i]!='\0'){
                for(int j=i+1;j<l;j++){
                    if(c[i]==c[j]){
                        p=1;
                        c[j]='\0';
                    }
                }
                if(p==0)
                System.out.print(c[i]+" ");
            }
        }
	}
}