#include <stdio.h>
int main() {
    int ary[3];
    int s = 0;
    *(ary + 0) = 1;
    ary[1] = *(ary + 0) + 2;
    ary[2] = *ary + 3;
    for (int i = 0; i < 3; i++)
        s = s+ ary[i];
    printf("%d", s);
}