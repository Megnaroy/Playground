#include<stdio.h>
int main()
{
  //Type your code here
  int n,c=0;
  scanf("%d",&n);
  int b[32];
  while(n!=0)
  {
    b[c]=n%2;
    c++;
    n=n/2;
  }
  for(int i=(c-1);i>=0;i--)
  {
  printf("%d",b[i]);
  }
  return 0;
}