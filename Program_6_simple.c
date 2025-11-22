#include<stdio.h>

int sumOfSquare(int num){
    int temp = num;
    int sum = 0;

    while(temp > 0){
        int rem = temp % 10;
        sum += rem * rem;
        temp = temp / 10;
    }

    return sum;
}

void main(){
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    if(n == 0){
        printf("NOT Happy");
        return;
    }


    int result = n;
    while(result != 1 && result != 4){
        result = sumOfSquare(result);
    }

    result == 1 ? printf("Happy") : printf("NOT Happy");
}
