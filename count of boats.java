/*Example Input/Output 1:
Input: 3
1 2
Output: 1
Explanation:
Here L = 3 and there are two people standing in the queue.
The sum of weights of the two people is 3 (1+2) which is less than or equal to L.
So both can travel in a single boat.
Hence the output is 1

Example Input/Output 2:
Input: 5
5 3 5 1 4 5 3
Output: 6
Explanation:
Here L = 5 and there are seven people standing in the queue.
The people having the weight 1 and 4 can travel in a single boat, as the sum of their weights is 5 (1+4) which is less than or equal to L.
The rest can travel on a separate boat.
So the minimum number of boats required is 6.
Hence the output is 6
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String s=scan.nextLine();
		String arr[]=s.split(" ");
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		ar.add(Integer.parseInt(arr[i]));
		Collections.sort(ar,Collections.reverseOrder());
		int c=0;
		while(ar.size()>0)
		{
		    boolean ans=true;
		    for(int i=1;i<ar.size();i++)
		    {
		        if(ar.get(0)+ar.get(i)<=n)
		        {
		            int k=ar.get(i);
		            ar.remove(Integer.valueOf(ar.get(0)));
		            ar.remove(Integer.valueOf(k));
		            c++;
		            ans=false;
		        }
		    }
		    if(ar.size()==1 || (ar.size()>0 && ans))
		    {
		    ar.remove(ar.get(0));
		    c++;
		    }
		}
		System.out.print(c);

	}
}
