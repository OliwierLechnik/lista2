#include <cstdio>

#include "prime.hpp"

int main(void){

    Prime prime(14);
    int nums[] = {2,0,4,8,-1};
    for(int i : nums){
        printf("%d - %d\n", i, prime[i]);
    }

    return 0;
}