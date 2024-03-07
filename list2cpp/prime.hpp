#ifndef PRIME_H
#define PRIME_H

class Prime{

    int *parts;
    int mx;

    public:
    Prime(int);
    ~Prime();
    int operator [] (int);
    void print();
};

#endif