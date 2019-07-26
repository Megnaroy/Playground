#include<stdio.h>
int main()
{
  	//type your code here
  int m,a,b,c=-1,d=-1;
  scanf("%d",&m);
  int arr[m];
  for(int i=0;i<m;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d %d",&a,&b);
  for(int i=0;i<m;i++)
  {
    if(arr[i]==a && c==-1)
    {
      c=i;
    }
    if(arr[i]==b && d==-1)
    {
      d=i;
      
    }
  }
   printf("Element 1 index = %d\n",c);
  printf("Element 2 index = %d\n",d);
      return 0;
}