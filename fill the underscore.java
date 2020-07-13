/*
Output Format: The first line contains an integer representing the number of slots in the string S that can be filled with the given N string values. 
Example Input/Output 1: 
Input: skill____programming________ 
5 
hardworking 
rack 
good 
platform 
developement 
Output: 
2 
Explanation: 
Here S = skill____programming________ 
There are 2 slots in the string S and their lengths are 4 and 8. 
The first slot can be filled with rack or good. 
The second slot can be filled with platform. 
Here both the slots are filled with the string values as per the given conditions. 
Hence the output is 2 
Example Input/Output 2: 
Input: 
cat___lion___tiger________Panda__________ 
6
Ox
Cat 
Mouse 
Emu 
Elephant 
Monkey 
Output: 
3 
Example Input/Output 3: 
Input:
#__Apples#__bananas 
4 
100 
12 
5000 
875 
Output: 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        String sp[]=new String[n];
        for(int i=0;i<n;i++){
            sp[i]=sc.next();
        }
        int j,res=0;
        for(int i=0;i<s.length();i++){
            int c=0;
            if(s.charAt(i)=='_'){
                c++;
            }
            for(j=i+1;j<s.length();j++){
                if(s.charAt(j)=='_'){
                    c++;
                }else{
                    break;
                }
            }if(c>0){
                int o=0;
            	for(int k=0;k<n;k++){
                    int l=sp[k].length();
                    if(l==c){
                        res++;
                        o++;
                        sp[k]="";
                        if(o==1){
                            break;
                        }
                     }
                 }
            }
            i=j-1;
        }
        System.out.print(res);
    }
}