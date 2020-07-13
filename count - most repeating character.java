/*input: communication
output: 2
input2: Microprogramming100
output: 3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        int count=0,m=0;
        Set<Integer> x=new HashSet<Integer>();
        for(int i=0;i<c.length;i++)
        {
            count=0;
            if(c[i]!='\0'){
                for(int j=i+1;j<c.length;j++)
                {
                    if(c[i]==c[j])
                    {
                        count++;
                        c[j]='\0';
                    }
                }
                x.add(count);
            }
        }
        List<Integer> a=new ArrayList<Integer>(x);
        Collections.sort(a);
        System.out.print(a.get(a.size()-1)+1);
	}
}