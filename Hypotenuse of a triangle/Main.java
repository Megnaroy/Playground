#include<stdio.h>
#include<math.h>
int main()
{
float b,p,h,a;
  scanf("%f %f",&b,&p);
  a=(b*b)+(p*p);
  h=sqrt(a);
  printf("%0.2f",h);
  return 0;
}