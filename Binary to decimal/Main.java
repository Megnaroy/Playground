#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int n,d,o=0,i=0;
  scanf("%d",&n);
  while(n!=0)
  {
    d=n%10;
    o=o+d*(pow(2,i));
    i++;
    n=n/10;
  }
  printf("%d",o);
  return 0;
}