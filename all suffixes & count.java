/*
Example Input/Output 1:
Input:
11
honey
danger
dangling
ball
honour
donkey
strong
state
honda
honesty
stroke
Output:
bal 1
dan 2
don 1
hon 4
sta 1
str 2
Explanation:
All possible suffixes in sorted are bal, dan, don, hon, sta and str.
The string ball has the suffix bal.
The string values danger and dangling have the suffix dan.
The string donkey has the suffix don.
The string values honey, honour, honda and honesty have the suffix hon.
The string state has the suffix sta.
The string values strong and stroke have the suffix str.
Hence the output is
bal 1
dan 2
don 1
hon 4
sta 1
str 2

Example Input/Output 2:
Input:
6
COOKIES
Icecream
Actor
cool
icecube
ACTIVITY
Output:
ACT 1
Act 1
COO 1
Ice 1
coo 1
ice 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0,l=0,m=0;
        String a[]=new String[n],b[]=new String[n];
        for(int i=0;i<n;i++){
            a[k++]=(sc.next()).substring(0,3);
        }
        int c[]=new int[n];
        for(int i=0;i<k;i++){
            int c1=1;
            if(!a[i].equals("*")){
                for(int j=i+1;j<k;j++){
                    if(a[i].equals(a[j])){
                        c1++;
                        a[j]="*";
                    }
                }
                b[l++]=a[i];
                c[m++]=c1;
            }
        }
        for(int i=0;i<l;i++){
            for(int j=1;j<l;j++){
                if(b[j-1].compareTo(b[j])>0){
                    String t1=b[j-1];
                    b[j-1]=b[j];
                    b[j]=t1;
                    int t2=c[j-1];
                    c[j-1]=c[j];
                    c[j]=t2;
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.println(b[i]+" "+c[i]);
        }
	  }
}
