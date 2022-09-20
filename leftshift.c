#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int n=5;
    int a[n];   
    int i,d,j,temp;
    scanf("%d",&d);
    //taking input from the user
    for(i=0;i<5;i++)
    {
    scanf("%d",&a[i]);
    }
    //confirming the shifts
    
    //shifting the elements of an array
    for(j=1;j<=d;j++)
    {
        
    {
            temp=a[0];
            for(i=0;i<n;i++)
            {
            a[i]=a[i+1];
            
            }
            a[n-1]=temp;
        }
       
    }