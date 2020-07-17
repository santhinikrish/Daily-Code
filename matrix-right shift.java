import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		int k=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		int top=0,left=0,bottom=r-1,right=c-1;
		while(top<=bottom&&left<=right)
		{
		    for(int i=left;i<=right;i++)
		    {
		        l.add(arr[top][i]);
		    }
		    top++;
		    for(int i=top;i<=bottom;i++)
		    {
		        l.add(arr[i][right]);
		    }
		    right--;
		    if(top<=bottom)
		    for(int i=right;i>=left;i--)
		    {
		        l.add(arr[bottom][i]);
		    }
		    bottom--;
		    if(left<=right)
		    for(int i=bottom;i>=top;i--)
		    {
		        l.add(arr[i][left]);
		    }
		    left++;
		}
		int c1=0;
		Collections.rotate(l,k);
		for(int i=0;i<l.size();i++)
		{
		    System.out.print(l.get(i)+" ");
		    c1++;
		    if(c1==c)
		    {
		        c1=0;
		        System.out.println();
		    }
		}
	}
}
