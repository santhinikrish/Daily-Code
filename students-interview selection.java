/*
Boundary Condition(s):
1 <= N <= 50 1 <= Length each students name <= 20 0 <= T, A, X, Y <= 100

Input Format:
The first line contains N. The next N lines, each contains the name of a student and the marks scored in the technical round, the aptitude round separated by a space.
The (N+2)nd line contains X and Y separated by a space.

Output Format:
The line(s) containing the names of the selected students or the first line contains -1 as per the given condition.

Example Input/Output 1:
Input:
6
xyz 65 86
PQR 95 90
BCD 70 92
mno 95 96
Efg 70 90
ABC 70 92
70 85
Output:
mno
PQR
ABC
BCD
Efg
Explanation:
Here X = 70 and Y = 85.
The names of the students who have scored at least 70 marks in the technical round and 85 marks in the aptitude round are PQR, BCD, mno, Efg and ABC.
After sorting the students based on their technical score in descending order, the names become PQR, mno, BCD, Efg and ABC.
Here, the students PQR and mno scored the same marks (95) in the technical round.
So they are sorted based on their aptitude marks in descending order.
Similarly, the students BCD, Efg and ABC the scored same marks (70) in the technical round.
So they are sorted based on their aptitude marks in descending order.
The students BCD and ABC scored the same marks in both the technical round and the aptitude round.
So they are sorted based on their names in ascending order.
Hence the output is
mno
PQR
ABC
BCD
Efg

Example Input/Output 2:
Input:
3
EFG 60 73
abcd 75 45
Pqr 55 46
75 75
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	 Scanner sc=new Scanner( System.in);
	 int n=sc.nextInt();
	 String[] s=new String[n];
	 int[] t=new int[n];
	 int[] a=new int[n];
	 for(int i=0;i<n;i++){
	     s[i]=sc.next();
	     t[i]=sc.nextInt();
	     a[i]=sc.nextInt();
	 }
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 int f=0;
	 for(int i=0;i<n;i++){
	     for(int j=i+1;j<n;j++){
	         if(t[i]<=t[j]){
	           if(t[i]==t[j] && a[i]>a[j])
	           continue;
	           if(t[i]==t[j] && a[i]==a[j] && s[i].compareTo(s[j])<=0)
	           continue;
	             String t1=s[i];
	             String t2=s[j];
	             s[i]="";
	             s[j]="";
	             s[i]=t2;
	             s[j]=t1;
	             int tem=t[i];
	             t[i]=t[j];
	             t[j]=tem;
	             int tem1=a[i];
	             a[i]=a[j];
	             a[j]=tem1;
	         }
	     }
	 }
	 for(int i=0;i<n;i++){
	     if(t[i]>=x&&a[i]>=y){
	         f=1;
	         System.out.println(s[i]);
	     }
	 }
	 if(f==0)
	 System.out.println("-1");

	}
}
