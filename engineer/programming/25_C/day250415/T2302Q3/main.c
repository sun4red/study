#include <stdio.h>
char n[30];
char *get()
{
    printf("입력하세요: ");
    gets(n);
    return n;
}
void main()
{
    char *n1 = get();
    char *n2 = get();
    char *n3 = get();
    printf("%s\n", n1);
    printf("%s\n", n2);
    printf("%s", n3);
}