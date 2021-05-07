#include <stdio.h>
int main()
{
    long long int a,b,p;
    int n;
    scanf("%d",&n);
    if(n>=1&&n<=10000){
        while(n--)
        {
            scanf("%I64d %I64d",&a,&b);
            if(a>=1&&b<=1000000000)
            p=a-b;
             if(p==0)
            {
                printf("0\n");
            }
            else if(p%2==0)
            {
                if(p>0)printf("1\n");
                if(p<0)printf("2\n");
            }
            else if(p%2!=0)
            {
                if(p>0)printf("2\n");
                if(p<0)printf("1\n");
            }
        }
    }
    else
    return 0;
return 0;
}
