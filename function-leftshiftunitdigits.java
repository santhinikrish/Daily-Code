/*input: 5
24 987 1 9870 15
output:
27 981 0 9875 14
*/


import java.util.*;
public class Hello
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int arr[]=new int[N];
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	    }
	    leftShiftUnitDigits(arr,N);
	    for(int i=0;i<N;i++){
		System.out.print(arr[i]+" ");
	    }
	}
	private static void leftShiftUnitDigits(int arr[], int N) {
    	    int a[]=new int[N];
    	    int k=0,res=0;
    	    for(int i=0;i<N;i++){
        	int f=arr[i]%10;
        	a[k++]=f;
    	    }
    	    int temp=a[0];
    	    for(int i=0;i<k-1;i++){
	        a[i]=a[i+1];
    	    }
	    a[k-1]=temp;
            String fin[]=new String[N];
            for(int i=0;i<N;i++){
            	if(arr[i]<10){
            	    String m=a[i]+"";
            	    fin[res++]=m;
                }else{
                    String m=(arr[i]/10)+""+a[i];
                    fin[res++]=m;		
            	}
            }
	    for(int i=0;i<res;i++){
                arr[i]=fin[i];
            }
    }
}