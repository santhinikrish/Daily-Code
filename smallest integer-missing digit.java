
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        for(int i=1;i<=9;i++){
            if(!(s.contains(i+"") ))
            ans+=i;
        }
        if(!(s.contains("0") )  ){
            if(ans!="")
            System.out.print(ans.substring(0,1)+"0"+ans.substring(1)  );
            else
            System.out.print("0");
            return;
        }
        System.out.print(ans!=""?ans:"-1");
	}
}
    (or)

import java.util.*;
public class Hello{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    int b[]=new int[20];
    int k=0;
    for(int i=0;i<10;i++)
    {
      int u=0;
      for(int j=0;j<a.length();j++)
      {
        int x=a.charAt(j)-'0';
        if(x==i)
        {
            u=1;
            break;
        }
      }
      if(u==0)
      {
        b[k++]=i;
      }
    }
    if(k==0){
      System.out.print("-1");
      System.exit(1);
    }
    if(b[0]==0)
    {
      int t=b[0];
      b[0]=b[1];
      b[1]=t;
    }
    for(int i=0;i<k;i++)
      System.out.print(b[i]);
}
