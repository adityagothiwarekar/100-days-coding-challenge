#include <stdio.h>

int balance(int x, int y, int w, int z)
{
    printf("%d\n",w+(x-y)*z);
}

int main(void) {
	// your code goes here
	int t;
	scanf("%d",&t);
	int w,x,y,z;
	
	while(t!=0)
	{scanf("%d %d %d %d", &w,&x,&y,&z);
	
	balance(x,y,w,z);
	
	t--;
	    
	}
	return 0;
}