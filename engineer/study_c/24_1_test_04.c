#include <stdio.h>
#include <string.h>
int main(){
    char str[] = "ABCDEFGH";
    char *fir_str;
    char *end_str;
    fir_str = &str[0];
    end_str = &str[strlen(str)-1];
    while(fir_str < end_str){

        printf("%s\n", "while start");
        printf("%s %c\n","*fir_str =" , *fir_str);
        printf("%s %c\n","*end_str =" , *end_str);
        printf("%s\n", str);
        printf("%s\n", "while start");

        char t = *fir_str;
        *fir_str = *end_str;
        *end_str = t;
        fir_str++;
        end_str--;

        printf("%s\n", "while end");
        printf("%s %c\n","*fir_str =" , *fir_str);
        printf("%s %c\n","*end_str =" , *end_str);
        printf("%s\n", str);
        printf("%s\n", "while end");
    }
    for(int i = 1; i< strlen(str); i+=2){
        printf("%c", str[i]);
    }
}