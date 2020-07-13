#include<stdio.h>
#include <stdlib.h>

int main()
{
    int i,j,k,a,b,c,d,e,f,n,l[1000]={0},max=-1;
    char s[1200];
    scanf("%s",s);
    for(i=0;i<strlen(s);i++)
    {
    l[s[i]]++;
    if(l[s[i]]>max)
    max=l[s[i]];
    }
    for(i=max;i>=0;i--)
    {
        for(j=65;j<=123;j++)
        {
            if(l[j]==i)
            {
                for(k=0;k<i;k++)
                printf("%c",j);
            }
        }
    }
}