/*\Example Input/Output 1:
Input: 02-Nov-2012
Output: DD-MMM-YYYY
Explanation: Here the given date is 02-Nov-2012, which is in the format DD-MMM-YYYY. Hence the output is DD-MMM-YYYY
Example Input/Output 2:
Input: 1997-27-02
Output: YYYY-DD-MM
Example Input/Output 3:
Input: 04-06-2017
Output: -1
Explanation: Here two formats are applicable, they are DD-MM-YYYY and MM-DD-YYYY. Hence the output is -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String sp=sc.next();
        String[] s=sp.split("-");
        int p=0;
        String a="";
        for(int i=0;i<3;i++){
            int l=s[i].length();
            if(l==4){
                a+="YYYY";
            }else if(l==3){
                a+="MMM";
                p=1;
            }else if(l==2){
                int g=Integer.parseInt(s[i]);
                if(a.contains("DD")){
                    if(g>=1&&g<=12){
                        a+="MM";
                    }else if(g>=13 && g<=31){
                        a=a.replace("DD","MM");
                        a+="DD";
                    }
                }
                 else if(!(a.contains("DD"))){
                    if(g>=1&&g<=31){
                        a+="DD";
                    }
                }
            }
            if(i!=s.length-1){
                a+="-";
            }
        }if(p==0){
            for(int i=0;i<3;i++){
                int g=Integer.parseInt(s[i]);
                if(g>=1&&g<=12){
                    for(int j=i+1;j<3;j++){
                        g=Integer.parseInt(s[j]);
                        if(g>=1&&g<=12){
                            System.out.print("-1");
                            System.exit(1);
                        }
                    }
                }
            }
        }
        System.out.print(a);
	}
}