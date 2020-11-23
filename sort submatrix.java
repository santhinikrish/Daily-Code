/*
Example Input/Output 1:
Input:
4 4
64 39 75 90
55 35 50 98
95 37 30 49
80 56 13 65
Output:
30 49 64 39
13 65 55 35
75 90 95 37
50 98 80 56
Explanation:
The four 2x2 submatrices in the given 4x4 matrix are given below.
64 39
55 35

75 90
50 98

95 37
80 56

30 49
13 65
After sorting the submatrices based on the integer present in the top-left position, the matrix becomes
30 49 64 39
13 65 55 35
75 90 95 37
50 98 80 56

Example Input/Output 2:
Input:
4 6
28 39 83 94 32 18
96 51 17 47 61 66
83 86 12 20 28 89
64 89 13 33 95 94
Output:
12 20 28 39 28 89
13 33 96 51 95 94
32 18 83 94 83 86
61 66 17 47 64 89
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int a[][]=new int[m][n];
		HashMap<Integer,ArrayList<String>> hm=new HashMap<>();
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		      a[i][j]=scan.nextInt();
		      if(i%2==0 && j%2==0 && !ar.contains(a[i][j]))
		      ar.add(a[i][j]);
		    }
		}
        Collections.sort(ar);
        int rc=0;
        ArrayList<Integer> pr=new ArrayList<>();
        for(int k=0;k<ar.size();k++)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i%2==0 && j%2==0 && ar.get(k)==a[i][j])
                    {
                        System.out.print(a[i][j]+" "+a[i][j+1]+" ");
                        pr.add(a[i+1][j]);
                        pr.add(a[i+1][j+1]);
                        rc++;
                    }
                    if(rc==n/2)
                    {
                        System.out.println();
                        for(int u=0;u<pr.size();u++)
                        System.out.print(pr.get(u)+" ");
                        rc=0;
                        System.out.println();
                        pr.clear();
                    }
                }
            }
        }
	}
}
