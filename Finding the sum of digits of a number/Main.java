#include <stdio.h>
int main() {
	 int num, temp, digit, sum = 0;
    scanf("%d", &num);
    temp = num;
    while (num > 0)
    {
        digit = num % 10;
        sum  = sum + digit;
        num /= 10;
    }
    printf("%d",sum);
	return 0;
}