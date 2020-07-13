#include<stdio.h>
#include <stdlib.h>

int main()
{

int r,c,i,j,ctr=0;
scanf("%d %d",&r,&c);
int a[r][c],k;
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    {
        scanf("%d",&a[i][j]);
    }
}
scanf("%d",&k);
for(i=0;i<=r-k;i++)
{
    for(j=0;j<=c-k;j++)
    {
        if(a[i][j]<=a[i][j+k-1] && a[i][j+k-1]<=a[i+k-1][j+k-1] && a[i+k-1][j+k-1]<=a[i+k-1][j])
        {
            ctr++;
        }
    }
}
printf("%d",ctr);

}