/*
input: 4 4 2
34 21 78 66
99 87 45 32
98 12 34 21
56 34 33 38
output:
78 66 32 21
21 87 45 38
34 12 34 33
99 98 56 34
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c,n,i,j;
scanf("%d %d %d",&r,&c,&n);
int a[r][c];
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    {
        scanf("%d ",&a[i][j]);
    }
}
n=n%4;
int t=0;
while(t<n)
{
    int p=0;
    while(p<c/2 && p<r/2)
    {
        int temp=a[p][p];
        a[p][p]=a[r-1-p][p];
        a[r-1-p][p]=a[r-1-p][c-1-p];
        a[r-1-p][c-1-p]=a[p][c-1-p];
        a[p][c-1-p]=temp;
        p++;
    }
    t++;
}
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    {
        printf("%d ",a[i][j]);
    }
    printf("\n");
}
}
