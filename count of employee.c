/*
input: 5 3
A IN 10:30
C IN 10:34
C OUT 12:35
A OUT 12:36
B IN 12:34
12:37
OUTPUT: 1
*/

#include<stdio.h>
#include <stdlib.h>
int main()
{
int r,n,i,j;
scanf("%d%d",&r,&n);
int inside=0;
char employee[r][51],status[r][5],timing[r][10],T[10],temp[100];
for(i=0;i<r;i++)
{
    scanf("%s%s%s",employee[i],status[i],timing[i]);
}
scanf("%s",T);
for(i=0;i<r;i++)
{
    for(j=0;j<r-1;j++)
    {
        if(strcmp(timing[j],timing[j+1])>0)
        {
            strcpy(temp,timing[j]);
            strcpy(timing[j],timing[j+1]);
            strcpy(timing[j+1],temp);
            strcpy(temp,status[j]);
            strcpy(status[j],status[j+1]);
            strcpy(status[j+1],temp);
        }
    }
}
for(i=0;i<r;i++)
{
    if(strcmp(timing[i],T)<=0)
    {
        if(status[i][0]=='I')
        {
            inside++;
        }
        else
        {
            inside--;
        }
    }
    else
    {
        break;
    }
}
printf("%d",inside);
}
