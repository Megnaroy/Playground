#include<stdio.h>
int main()
{
	//type your code here
	int n;
  scanf("%d",&n);
  int arr[n],j=1;
  arr[0]=0;
  for(int i=1;i<n;i++)
  {
    if(i%2==0)
      arr[i]=i;
    else
    {
      arr[i]=i-j;
       j++;
    }
  }
  printf("%d",arr[n-1]);
}