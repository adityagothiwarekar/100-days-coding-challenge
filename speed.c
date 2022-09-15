#include <stdio.h>

int speed(int d, int z)
{
    return d*z;
}

int main(void) {
	int t,a,x,b,y,z,d,c,f;
	scanf("%d",&t);
	while(t!=3)
	{
	    printf("enter the values ");
	    scanf("%d %d",&a,&x);
	    a=d;
	    x=z;
	    c=speed(a,x);
	    printf("enter the values ");
	    scanf("%d %d",&b,&y);
	    b=d;
	    y=z;
	    f=speed(b,y);
	    if(c>y)
	    {
	        printf("alice");
	    }
	    else if(c==f)
	    {
	        printf("equal");
	    }
	    else
	    {
	        printf("bob");
	    }
	    
	    
	    
	    t--;
	}
	
	return 0;
}