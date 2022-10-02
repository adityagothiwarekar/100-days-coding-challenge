#include <stdio.h>
int t,k,x,z;

int main(void) {
	scanf("%d",&t);
	
	    while(t!=0)
	    {
	         scanf("%d %d",&k,&x);
	        z=k-x;
	        printf("%d",z);
	       t--;
	    }
	    return 0;
}
