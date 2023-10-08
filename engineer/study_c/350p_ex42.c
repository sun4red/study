#include <stdio.h>
int isPrime(int number){
    for (int i = 2; i < number; i++)
        if(number % i == 0) return 0;
    return 1;
}

int main() {
    int number = 13195;
    int max_div = 0;
    for (int i = 2; i < number; i++)
        if(isPrime(i) == 1 && number % i == 0) max_div = i;
    printf("%d", max_div);
}