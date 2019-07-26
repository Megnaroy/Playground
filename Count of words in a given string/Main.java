#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100];
  int c=0;
  scanf("%[^\n]s",str);
  int l=strlen(str);
  str[l+1]=' ';
  for(int i=0;i<=(l+1);i++)
  {
      if(str[i]==' ')
      {
      //oarr[c]=j-i;
        c++;
      }
  }
  printf("%d",c);
  return 0;
}