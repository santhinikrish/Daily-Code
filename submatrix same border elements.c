//Sub Matrix - Same Border Elements
#include<stdio.h>
#include <stdlib.h>

int main()
{
int R,C,K;
scanf("%d %d",&R,&C);
int matrix[R][C];
for(int i=0;i<R;i++)
{
    for(int j=0;j<C;j++)
    {
        scanf("%d",&matrix[i][j]);
    }
}
scanf("%d",&K);
for(int i=0;i<=R-K;i++)
{
    for(int j=0;j<=C-K;j++)
    {
        int temp=matrix[i][j],flag=0;
        for(int p=i;p<i+K;p++)
        {
            for(int q=j;q<j+K;q++)
            {
                if(p==i || q==j || p==(i+K)-1 || 
                q==(j+K)-1)
                {
                    if(matrix[p][q]!=temp){
                        flag=1;
                        break;
                    }
                }
            }
        }
        if(flag==0){
            printf("YES");
            return 0;
        }
    }
}
printf("NO");
}