#include <stdio.h>
int main()
{
    int i, j, s;
    int el = 0;
    for (i = 6; i <= 30; i++)
    {
        s = 0;
        int k = i / 2;
        for (j = 1; j <= k; j++)

            if (i % j == 0)
                s = s + j;

        if (s == i){
            printf ("%d num", i);
            el++;}
    }
    printf("%d", el);
    return 0;
}