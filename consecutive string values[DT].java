/*input: 5 3
apple orange orange orange mango
ouput: yes
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt(),count,p=0;
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            count=0;
            for(int j=i+1;j<n;j++){
                if(s[i].equalsIgnoreCase(s[j])){
                    count++;
                }else{
                    break;
                }
            }
            if(count>=k-1){
                System.out.print("yes");
                System.exit(1);
                p=1;
            }
        }
        if(p==0){
            System.out.print("no");
        }
    }
}
