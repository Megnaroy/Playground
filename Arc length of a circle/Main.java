#include<stdio.h>
int main()
{
  float r,x,a;
  scanf("%f %f",&r,&x);
  a=2*3.14*r*(x/360);
  printf("%0.2f",a);
  return 0;
}