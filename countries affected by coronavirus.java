/*
Input:
6
Mr.Ahbain USA
Mr.Lee Ming China
Ms.Maa Long China
Mr.Verana Latta India
Ms.Jwlin Rij China
Ms.Abc USA
Output:
China 3
USA 2
India 1
Explanation:
In USA, 2 persons affected by the coronavirus(Mr.Ahbain and Ms.Abc). 
So the count is 2. 
In China, 3 persons affected by the coronavirus(Mr.Lee Ming, Ms.Maa Long and Ms.Jwlin Rij). 
So the count is 3. 
In India, 1 person affected by the coronavirus(Mr.Verana Latta). 
So the count is 1. 
So the names of countries with the number of corona affected persons are printed based on the given conditions. 
China 3 
USA 2 
India 1
*/



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[50];
        int k=0;
        for(int i=0;i<n;i++){
            String[] sp=sc.nextLine().split(" ");
            int l=sp.length;
            a[k++]=sp[l-1];
        }
        int b[]=new int[n];
        String name[]=new String[n];
        int c,l=0,m=0;
        for(int i=0;i<k;i++){
            c=1;
            if(a[i]!=""){
                for(int j=i+1;j<n;j++){
                    if(a[i].equals(a[j])){
                        c++;
                        a[j]="";
                    }
                }
                name[l++]=a[i];
                b[m++]=c;
            }
        }
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(b[i]<b[j]){
                    int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                    String z=name[i];
                    name[i]=name[j];
                    name[j]=z;
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.println(name[i]+" "+b[i]);
        }
	}
}