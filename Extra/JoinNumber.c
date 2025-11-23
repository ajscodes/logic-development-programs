#include <stdio.h>

int joinTwo(int a, int b){
    int temp = b, multi = 1;

    while (temp != 0)
    {
        multi *= 10;
        temp /= 10;
    }

    return a * multi + b;
}

int main(){
    int n1, n2;

    printf("Enter number1: ");
    scanf("%d", &n1);

    printf("Enter number2: ");
    scanf("%d", &n2);

    printf("%d", joinTwo(n1, n2));

    return 0;
}
