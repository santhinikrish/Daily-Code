/*
input: 4 4
u m o a
h n a o
y h r w
b n h e
output: 4
*/



#include<stdio.h>
#include <stdlib.h>

int main()
{
int nm,mn,x,y,k,j,i,f;
scanf("%d %d\n",&nm,&mn);
char ar[nm][mn],c;
for(x=0;x<nm;x++)
{
    for(y=0;y<mn;y++)
    {
        scanf("%c ",&c);
        ar[x][y]=c;
    }
}
x=0;
y=mn-1;
k=0;
while(x<nm)
{
    c=ar[x][y];
    f=0;
    for(i=x,j=y;(j<mn&&i<nm);i++,j++)
    {
        if(c!=ar[i][j])
        {
            f=1;
            break;
        }
    }
    if(f==0)
    {
    k++;
    }
    if(y>0)
    y--;
    else
    x++;
}
printf("%d",k);
}