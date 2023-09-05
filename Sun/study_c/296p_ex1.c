#include <stdio.h>
void swap(int* a, int idx1, int idx2){
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
}

void Usort(int* a, int len) {
    for(int i = 0; i < len - 1; i++)
        for(int j = 0; j < len -1 - i; j++)
            if (a[j] > a[j + 1])
                swap(a, j, j + 1);
}

main(){
    int a[] = { 85, 75, 50, 100, 95 };
    int nx = 5;
    Usort(a, nx);
}