/*input: 7cD
output: yes
expla: 7cD is 1997
*/


import java.util.*;
//import java.util.Matcher;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=null;
        try{
            sc=new Scanner(System.in);
            String n=sc.next();
            String s="^[0-9A-Fa-f]+$";
            if(n.matches(s)){
                System.out.print("yes");
            }else{
                System.out.print("no");
            }
        }
        finally{
            if(sc!=null){
                sc.close();
            }
        }
	}
}

	(or)
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		    if(!((ch[i]>='A' &&  ch[i]<='F')||(ch[i]>='a' && ch[i]<='f')||(ch[i]>='0' && ch[i]<='9')))
		    {
		        System.out.print("no");
		        System.exit(1);
		    }
	    }
	    System.out.print("yes");
    }
}
