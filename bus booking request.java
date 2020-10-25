import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int busNumber = sc.nextInt();
		int noOfDays = sc.nextInt();
		int [] res = new int [busNumber];
		int [] start = new int [noOfDays];
		int [] end = new int [noOfDays];
		int [] ticket = new int [noOfDays];
		for(int i=0;i<noOfDays;i++){
		    start[i] = sc.nextInt();
		    end[i]=sc.nextInt();
		    ticket[i] = sc.nextInt();
		}
		for(int i=0;i<start.length;i++){
		    int t=ticket[i];
		    for(int j=start[i]-1;j<end[i];j++)
		    res[j]+=t;
		}
		for(int i: res)
		System.out.print(i+" ");

	}
}
