#include <stdio.h>

int main(void) {
    int t,x,y,result;
        scanf("%d",&t);
        while(t!=0)
        {
            scanf("%d",&x);
            scanf("%d",&y);
            result=x>y?x:y;
            if(result==x)
            {
                printf("yes\n");
            }
            else
            {
                printf("no\n");
            }
            t--;
        }
	return 0;
}

