#include <stdio.h>

int main(void) {
	int x,h,t;
	int result;
	scanf("%d",&t);
	while(t!=0)
	{
	    scanf("%d",&x);
	    scanf("%d",&h);
	    result=x>h?x:h;
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

