#include<stdio.h>
int main()
{
  //Type your code here
  int n,a=0,b=1,c;
  scanf("%d",&n);
   if(n==1)
    printf("%d",a);
  else if(n==2)
    printf("0 1");
  else
  {
    printf("0 1");
  for(int i=3;i<=n;i++)
  {
    c=a+b;
    printf(" %d",c);
    a=b;
    b=c;
  }
  }
 
  return 0;
}