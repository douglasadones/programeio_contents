#include <stdio.h>

int main() {
    char name; 
    double gainPerSale = 0.15;
    double salary, totalSaleInAMonth, TOTAL;
    scanf("%s %lf %lf", &name, &salary, &totalSaleInAMonth);
    TOTAL = (salary + (gainPerSale * totalSaleInAMonth));
    printf("TOTAL = R$ %.2lf\n", TOTAL);
    return 0;
}