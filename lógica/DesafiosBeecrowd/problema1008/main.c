#include <stdio.h>

int main() {
    int number, workHoursInAMonth;
    double  salaryPerHour;
    scanf("%d %d %lf", &number, &workHoursInAMonth, &salaryPerHour);
    double SALARY  = (workHoursInAMonth * salaryPerHour);
    printf("NUMBER = %d\n", number);
    printf("SALARY = U$ %.2f\n", SALARY);
    return 0;
}