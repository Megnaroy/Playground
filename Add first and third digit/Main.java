#include<stdio.h>
int main()
{
 int num;
  scanf("%d",&num);
  int ld=num%10;
  int fd=num/100;
  int sum=ld+fd;
  printf("%d",sum);
  return 0;
}