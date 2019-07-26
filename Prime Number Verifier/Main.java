// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int n,i,c=0,f=0;
  scanf("%d",&n);
  if((n==1) || (n==0))
  {
    f++;
    printf("neither");
  }
  for(i=1;i<=n;i++)
  {
    if(n%i==0)
    c++;
  }
  if(f==0)
  {
  if(c==2)
    printf("prime");
  else
    printf("composite");
  }
   return 0;
}