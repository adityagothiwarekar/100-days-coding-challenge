#include <stdio.h>

int main(void) {
    int t;
    int x;
    int y;
    scanf("%d",&t);
    while(t!=0)
    {
        scanf("%d %d",&x,&y);
        if(y<=x*1.07)
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

