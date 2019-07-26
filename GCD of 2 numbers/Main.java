// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#define nmax(x,y) ((x) >= (y)) ? (x) : (y)
// Main function
int main()
{
  int a,b,gcd=1;
  scanf("%d %d",&a,&b);
  int m=(a>b)?a:b;
  for(int i=1;i<m;i++)
  {
    if(a%i==0 && b%i==0)
    {
      gcd=nmax(gcd,i);
    }
  }
  printf("%d",gcd);
  
   return 0;
}