#include <stdio.h>

int main()
{
    int h, km, distance;
    double spend_fuel;
    
    scanf("%d %d" , &h, &km);
    
    distance = h * km;
    spend_fuel = distance / 12.0;
    
    printf("%.3f\n", spend_fuel);

    return 0;
}