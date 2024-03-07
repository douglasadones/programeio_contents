#include <stdio.h>

double averageCalculator(double N1, double N2,double N3, double N4) {
    double average = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / (1 + 2 + 3 + 4);
    return average;
}


int main()
{
    double N1, N2, N3, N4, N5, average, exam_average;
    
    scanf("%lf%lf%lf%lf", &N1, &N2, &N3, &N4);
    
    
    average = averageCalculator(N1, N2, N3, N4);
    
    printf("Media: %.1f\n", average);
    
    if (average >= 7.0) {
        printf("Aluno aprovado.\n");
    } else if (average < 5.0) {
        printf("Aluno reprovado.\n");
    } else if (average >= 5.0 && average <= 6.9) {
        printf("Aluno em exame.\n");
        scanf("%lf", &N5);
        printf("Nota do exame: %.1f\n", N5);
        
        exam_average = (average + N5) / 2;
        
        if (exam_average >= 5.0) {
            printf("Aluno aprovado.\n");
        } else{
            printf("Aluno reprovado.\n");
        }
        
        printf("Media final: %.1f\n", exam_average);
    }
    

    return 0;
}