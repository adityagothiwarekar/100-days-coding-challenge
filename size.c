#include <stdio.h>
int t,x,x,y,n;

int main(void) {
	scanf("%d",&t);
	
	    while(t!=0)
	    {
	        scanf("%d %d %d",&n,&x,&y);
	        if(n>(x+2*y))
	        {
	            printf("YES");
	        }
	        else
	        {
	            printf("NO");
	        }
	       t--;
	    }
	    return 0;
}