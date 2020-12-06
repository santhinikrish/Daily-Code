/*
Input:
5
576 332 3456 89 96
Output:
96 3456 576
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int index=0;index<N;index++){
		    arr[index]=sc.nextInt();
		}
		for(int index=N-1;index>=0;index--){
		    if(arr[index]%10==arr[N-1]%10){
		        System.out.print(arr[index]+" ");
		    }
		}
	}
}
