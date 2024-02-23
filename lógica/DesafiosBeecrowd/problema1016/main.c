#include <stdio.h>

int main()
{
    int kilometers_away, total_minutes;
    int X = 60;
    int Y = 90;
    
    scanf("%d" , &kilometers_away);
    
    total_minutes = kilometers_away * 2;
    
    printf("%d minutos\n", total_minutes);

    return 0;
}