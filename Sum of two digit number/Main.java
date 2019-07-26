#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int ld=a%10;
  int fd=a/10;
  int sum=ld+fd;
  printf("%d",sum);
  return 0;
}