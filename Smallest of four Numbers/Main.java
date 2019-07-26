#include<stdio.h>
#define min(x,y) ((x<y)?(x):(y))
int main()
{
  // Type your code here
  int arr[4],i;
  for(int i=0;i<4;i++)
  {
    scanf("%d",&arr[i]);
  }
  int m=arr[0];
  for(i=0;i<4;i++)
  {
    for(int j=i+1;j<4;j++)
    {
      if(arr[i]<arr[j])
        m=min(m,arr[i]);
      else
        m=min(m,arr[j]);
    }
  }
  printf("%d",m);
}