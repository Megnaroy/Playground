#include <stdio.h>
int main() {
	int t,rev=0,d;
  scanf("%d",&t);
  while(t!=0)
  {
    d=t%10;
    rev=rev*10+d;
    t=t/10;
  }
  int sd=(rev/10)%10;
  printf("%d",sd);
	return 0;
}