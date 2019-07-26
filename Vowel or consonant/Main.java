#include<stdio.h>
int main()
{
  //type your code here
  char a;
  scanf("%c",&a);
  if(a=='a'|| a=='e'||a=='i'||a=='0'||a=='u'|| a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}