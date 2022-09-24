#include <stdio.h>

int main(void) {    
    int t,n,i,count=0;
    int a[n];
    scanf("%d",&t);
    while(t!=0)
    {
        scanf("%d",&n);
        for(i=0;i<n;i++)
        {
            scanf("%d",&a[i]);
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                printf("0\n");
            }
            else{
                for(i=0;i<n;i++)
                {
                    if(a[i]<0)
                    {
                        count++;
                    }
                }
            }
        }
        if(count%2==0)
        {
            printf("0\n");
        }
        else
        {
            printf("1\n");
        }
        t--;
    }
	return 0;
}

