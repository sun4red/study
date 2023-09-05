#include <stdio.h>
int main() {
    int number = 1234;
    int div = 10, result = 0;

    while (number != 0){
        result = result * div;
        result = result + number % div;
        number = number / div;
    }
    printf("%d", result);
}