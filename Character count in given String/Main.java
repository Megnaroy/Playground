#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char str[20];
  int i=0,j=1,c=0,l;
  scanf("%[^/n]s",str);
  for(l=0;str[l]!='\0';l++);
  while(str[i]!='\0')
  {
    if(l>20)
    {
       printf("Invalid Input");
      return 0;
    }
    else
    {
    c=0;
    while(str[i]==str[j])
    {
      c++;
      j++;
    }
    printf("%c%d",str[i],c+1);
    i=j;
    j=i+1;
  }
  }
  return 0;
}