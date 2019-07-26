#include <stdio.h>
int main()
{
  	int b,e,a=1;
  scanf("%d %d",&b,&e);
  if(e>=0)
  {
    for(int i=1;i<=e;i++)
    {
      a=a*b;
    }
    printf("%d",a);
  }
  else
    printf("Wrong input");
  
    return 0;
}