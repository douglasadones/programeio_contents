#include <stdio.h>

// double priceOfAProduct() {  // Por qual motivo não posso usar a função assim: totalPrice += priceOfAProduct();?
//     int code, units; 
//     double priceOfAnUnit, totalPrice;;
//     scanf("%d %d %lf", &code, &units, &priceOfAnUnit);
//     return units * priceOfAnUnit;
// }

int main() {
    int code, units; 
    double priceOfAnUnit, totalPrice;;
    
    scanf("%d %d %lf", &code, &units, &priceOfAnUnit);
    totalPrice += units * priceOfAnUnit;

    scanf("%d %d %lf", &code, &units, &priceOfAnUnit);
    totalPrice += units * priceOfAnUnit;

    printf("VALOR A PAGAR: R$ %.2lf\n", totalPrice);

    return 0;
}