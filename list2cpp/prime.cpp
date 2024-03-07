#include "prime.hpp"

#include <cstdio>
#include <cstdlib>


Prime::Prime(int n){

    this->parts = (int *)malloc(sizeof(int)*n);
    int isPrime[n];
    for(int& i : isPrime){
        i=1;
    }

    int counter = 0;
    for(int i = 2; i < n; i++){
        if(isPrime[i] == 1){
            parts[counter] = i;
            counter++;
            int j = 2*i;
            while(j < n){
                isPrime[j] = 0;
                j += i;
            }
        }
    }
    // for(int i = 0; i < 16; i++){
    //     printf("%d\n", this->parts[i]);
    // }
    this->mx = counter;
}

Prime::~Prime(){
    free(this->parts);
}

int Prime::operator[](int n){

    if(n<this->mx && n >= 0){
        return this->parts[n];
    }else{
        printf("Index out of bounds. Returning -1 as placeholder.\n");
        return -1;
    }
}