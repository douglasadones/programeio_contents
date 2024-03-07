#include <stdio.h>

int main()
{
    int n1, n2, n3;
    int num_array[3];
    int position_aux, smaller_position;
    
    
    scanf("%d %d %d", &n1, &n2, &n3);
    
    num_array[0] = n1;
    num_array[1] = n2;
    num_array[2] = n3;
    
    
    for(int i=0; i<3; i++) {
        for (int p=i+1; p < 3; p++) {
            if (num_array[i] > num_array[p]) {
                smaller_position = p;
                position_aux = num_array[i];
                num_array[i] = num_array[smaller_position];
                num_array[smaller_position] = position_aux;
            }
            
        }
    }
    
    for (int i=0; i < 3; i++) {
        printf("%d\n", num_array[i]);
    }
    
    printf("\n");
    
    printf("%d\n%d\n%d\n", n1, n2, n3);

    return 0;
}