#include <stdio.h>
int main()
{
    int a = 10;
    int *p = &a;

    printf("a = %d\n", a);
    printf("&a = %d\n", &a);
    printf("p = %d\n", p);
    printf("*p = %d\n", *p);
}