#include <stdio.h>
int main(int argc, char *argv[])
{
    int a[4] = {0, 2, 4, 8};
    int b[3] = {};
    int i = 1;
    int sum = 0;
    int *p;
    for (i; i < 4; i++)
    {
        p = a + i;
        b[i - 1] = *p - a[i - 1];
        sum = sum + b[i - 1] + a[i];
        printf("b[%d] = %d \n", i-1, b[i-1]);
    }
    printf("%d", sum);
    return 0;
}