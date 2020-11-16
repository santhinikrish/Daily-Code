/*
Example input/output 1:
Input 1:
5
Output:
-----0
----505
---45054
--3450543
-234505432
12345054321

Example input/output 2:
Input 2:
8
Output :
--------0
-------808
------78087
-----6780876
----567808765
---45678087654
--3456780876543
-234567808765432
12345678087654321
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("-".repeat(N)+"0");
		for(int ctr=N;ctr>=1;ctr--){
		    System.out.print("-".repeat(ctr-1));
		    for(int val=ctr;val<=N;val++){
		        System.out.print(val);
		    }
		    System.out.print("0");
		    for(int val=N;val>=ctr;val--){
		        System.out.print(val);
		    }
		    System.out.print("\n");
		}

	}
}
