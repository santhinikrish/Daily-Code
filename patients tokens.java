/*input:5
sandy 09:30
joel 11:15
priya 21:00
abdul 13:46
kapli 13:45
output:
sandy 1
joel 2
kapli 3
abdul 4
priya 5
*/


import java.util.*;
class Hello{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            a[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].compareTo(a[j])>0){
                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                    String k=s[i];
                    s[i]=s[j];
                    s[j]=k;
                }
            }
        }
        int v=1;
        for(int i=0;i<n;i++){
            System.out.print(s[i]+" "+(v++)+'\n');
        }
    }
}