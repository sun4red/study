#include <stdio.h>
struct A{
    int n;
    int g;
};
main(){
    struct A st[2];
    for(int i = 0; i < 2; i++){
        st[i].n = i;
        st[i].g = i + 1;
    }
    printf("%d", st[0].n + st[1].g);
}