#include <stdio.h>
int t,x,result;

int main(void) {
	scanf("%d",&t);
	{
	    while(t!=0)
	    {
	        scanf("%d",&x);
	        result =x>7?printf("YES"):printf("NO");
	        t--;
	    }
	}
	return 0;
}