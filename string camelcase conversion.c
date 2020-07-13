/*input: skill a rack
output: SkillARack
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    int i=0;
    while(scanf("%s ",s)>0)
    {
        for(int j=0;j<strlen(s);j++)
        if(j==0){
            printf("%c",toupper(s[j]));
        }else{
            printf("%c",s[j]);
        }
        i++;
    }
}