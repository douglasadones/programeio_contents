#include <stdio.h>
#include <stdbool.h>

bool isPossible(double A, double B, double C) {
    if ((A + B) > C && (A + C) > B && (B + C) > A) {
        return true;
    }
    
    return false;
}


int main()
{
    double A, B, C;
    bool possible;
    
    scanf("%lf %lf %lf", &A, &B, &C);
    possible = isPossible(A, B, C);
    
    if (possible) {
        printf("Perimetro = %.1f\n", A+B+C);
    } else {
        printf("Area = %.1f\n", ((A+B)*C)/2);
    }
    

    return 0;
}