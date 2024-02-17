#include <stdio.h>

int main() {
    double pi = 3.14159;
    double A, R;
    scanf("%lf", &R);
    A = pi * (R * R);
    printf("A=%.4f\n", A);

    return 0;
}