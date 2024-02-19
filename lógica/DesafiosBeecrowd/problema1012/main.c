#include <stdio.h>
#include <math.h>

double triangle(double baseA, double heightC){
    double result = (baseA * heightC) / 2.0;
    return result;
}

double circle(double radiusC){
    double pi = 3.14159;
    double result = pi * pow(radiusC, 2);
    return result;
}

double trapezium(double baseA, double baseB, double heightC){
    double result = ((baseA + baseB) * heightC) / 2.0;
    return result;
}

double square(double sideB){
    double result = pow(sideB, 2);
    return result;
}

double rectangle(double sideA, double sideB){
    double result = sideA * sideB;
    return result;
}

int main(){
    double A, B, C;

    scanf("%lf %lf %lf", &A, &B, &C);
    
    printf("TRIANGULO: %.3lf\n", triangle(A, C));
    printf("CIRCULO: %.3lf\n", circle(C));
    printf("TRAPEZIO: %.3lf\n", trapezium(A, B, C));
    printf("QUADRADO: %.3lf\n", square(B));
    printf("RETANGULO: %.3lf\n", rectangle(A, B));

    return 0;
}