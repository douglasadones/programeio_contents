#include <stdio.h>

int main()
{
    int days_input, result_in_days, result_in_months, result_in_years;
    scanf("%d", &days_input);
    
    result_in_years = days_input / 365;
    result_in_months = (days_input % 365) / 30;
    result_in_days = ((days_input % 365) % 30);
    
    
    printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", result_in_years, result_in_months, result_in_days);
    

    return 0;
}