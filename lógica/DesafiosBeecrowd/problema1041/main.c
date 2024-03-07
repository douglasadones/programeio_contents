#include <stdio.h>
#include <string.h>

int main()
{
    double x_coordinate, y_coordinate;
    char position[7];
    
    scanf("%lf %lf", &x_coordinate, &y_coordinate);
    
    if (x_coordinate == y_coordinate && y_coordinate == 0) {
        strcpy(position, "Origem");
    } else if (x_coordinate == 0 && y_coordinate != 0) {
        strcpy(position, "Eixo Y");
    } else if (x_coordinate != 0 && y_coordinate == 0) {
        strcpy(position, "Eixo X");
    } else if (x_coordinate > 0 && y_coordinate > 0) {
        strcpy(position, "Q1");
    } else if (x_coordinate < 0 && y_coordinate < 0) {
        strcpy(position, "Q3");
    } else if (x_coordinate < 0 && y_coordinate > 0) {
        strcpy(position, "Q2");
    } else if (x_coordinate > 0 && y_coordinate < 0) {
        strcpy(position, "Q4");
    }
    
    printf("%s\n", position);

    return 0;
}