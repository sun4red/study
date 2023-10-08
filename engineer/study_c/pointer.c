#include <stdio.h>
main(){
    printf("%s\n","=============================");

int arr[] = {11,22,33,44,55};



int ap = *arr;
int ad = &arr;
printf("arr[] = {%d, %d, %d, %d, %d}\n", arr[0], arr[1], arr[2], arr[3], arr[4]);
printf("arr[0] value : %d\n", arr[0]);
printf("ap(*arr) = %d\n", ap);
printf("arr = %d\n", arr);
printf("*arr(arr[0]) = %d\n", *arr);
printf("ad(arr) = %d\n", ad);
ap = *(arr + 4);

*arr += 2;
printf("*(arr + 4) = %d\n", ap);
printf("*arr + 2 = %d\n", *arr);


    printf("%s\n","=============================");
}