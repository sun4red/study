#include <stdio.h>
int main(){


    char str[] = "TEST";
    char *fir_str;
    char *end_str;
    fir_str = &str[0];
    end_str = &str[strlen(str)-1];

printf("%s\n","=============================");

printf("%s %s\n" , "str =" , str);
printf("%s %c\n" , "*fir_str =", *fir_str );
printf("%s %c\n" , "*(fir_str + 1) =", *(fir_str + 1));
printf("%s %c\n" , "*fir_str + 1 =", *fir_str + 1);
printf("%s %c\n" , "*++fir_str =", *++fir_str );

printf("%s\n","=============================");


}