/*input: 5 3
2 4 7 3 1
output: yes
expla: 2 4 7 subset is in asc ord or 7 3 1 is in desc ord
any one subset should be in asc or desc
*/

a,b=map(int,input().split())
arr=list(map(int,input().split()))
for i in range(len(arr)-b+1):
    ele=arr[i:i+b]
    asc=sorted(ele)
    des=sorted(ele,reverse=True)
    if(asc==ele or des==ele):
        print("Yes")
        quit()
print("No")
		(or)

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,k;
    scanf("%d %d",&n,&k);
    int a[120],i,j,c1,c2;
    for(i=1;i<=n;i++)
        scanf("%d ",&a[i]);
    for(i=1;i<=n-k+1;i++)
    {
       c1=c2=0;
        for(j=i+1;j<i+k;j++)
        {
            if(a[j]<a[j-1])
                c1++;
            else
                c2++;
        }
        if(c1==k-1||c2==k-1)
        {
            printf("Yes");
            return 0;
        }
    }
    printf("No");

}
