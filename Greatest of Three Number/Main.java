#include <stdio.h>
long int great(long int x,long int y,long int z)
{
  if(x>y && x> z)
    return x;
  else if(y>z)
    return y;
  else
   return z;
}
int main()
{ 
    long int a,b,c;
  scanf("%ld,%ld,%ld",&a,&b,&c);
  printf("%ld",great(a,b,c));
}