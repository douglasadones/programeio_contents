#include <stdio.h>

int main()
{
    int one_hundred_note, fifty_note, twenty_note, 
    ten_note, five_note, two_note, one_real_coin = 0;
    
    double total_price = 0.0;
    
    scanf("%lf", &total_price);
    
    printf("%lf\n", total_price);
    
    one_hundred_note = total_price / 100;
    total_price -= one_hundred_note *  100;
    
    fifty_note = total_price / 50;
    total_price -= fifty_note * 50;
    
    twenty_note = total_price / 20;
    total_price -= twenty_note * 20;
    
    ten_note = total_price / 10;
    total_price -= ten_note * 10;
    
    five_note = total_price / 5;
    total_price -= five_note * 5;
    
    two_note = total_price / 2;
    total_price -= two_note * 2;
    
    one_real_coin = total_price / 1;
    total_price -= one_real_coin * 1;
    
    printf("%.2lf\n", total_price);
    
    printf("NOTAS:\n");
    printf("%d nota(s) de R$ 100.00\n", one_hundred_note);
    printf("%d nota(s) de R$ 50.00\n", fifty_note);
    printf("%d nota(s) de R$ 20.00\n", twenty_note);
    printf("%d nota(s) de R$ 10.00\n", ten_note);
    printf("%d nota(s) de R$ 5.00\n", five_note);
    printf("%d nota(s) de R$ 2.00\n", two_note);
    printf("MOEDAS:\n");
    printf("%d moeda(s) de R$ 1.00\n", one_real_coin);
    printf("%d moeda(s) de R$ 0.50\n", fifty_note);
    printf("%d moeda(s) de R$ 0.25\n", twenty_note);
    printf("%d moeda(s) de R$ 0.10\n", ten_note);
    printf("%d moeda(s) de R$ 0.5\n", five_note);
    printf("%d moeda(s) de R$ 0.1\n", two_note);

    return 0;
}