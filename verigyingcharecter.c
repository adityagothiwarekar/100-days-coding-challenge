int main() {
	
	int t,count=0;
	int a[4], r;
	scanf("%d", &t);
	
	while(t!=0)
	{
	  for(int r=0;r<4;r++)
	  {
	      scanf("%d",&a[r]);
	  }
	  for(int i=0; i<4;i++)
	  {
	      if(a[i]==1)
	        count++;
	   }
	   if(count>=1)
	    printf("out\n");
	   else
	    printf("in\n");
	  
	  t--; }
	
	return 0;
}