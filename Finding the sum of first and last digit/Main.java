#include <stdio.h>
#include <math.h>
int main() {
int n;
  scanf("%d",&n);
  int ld=n%10;
  int count = log10(n);
  int fd = n / pow(10, count);
  int sum=ld+fd;
  printf("%d",sum);
	return 0;
}