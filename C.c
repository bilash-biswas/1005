#include<stdio.h>
int main()
{
    double A,B,C,D,Z;
    A = 3.5;
    B = 7.5;
    scanf("%lf",&C);
    scanf("%lf",&D);
    Z = (A * C + B * D) / (A + B);
    printf("MEDIA = %.5lf\n", Z);
    return 0;
}
