#include<stdio.h>
int main()
{
  //type your code here
  int n,c=0,o[32];
  scanf("%d",&n);
  while(n!=0)
  {
    o[c]=n%8;
    c++;
    n=n/8;
  }
  for(int i=(c-1);i>=0;i--)
  {
    printf("%d",o[i]);
  }
  return 0;
}