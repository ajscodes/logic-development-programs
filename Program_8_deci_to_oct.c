#include<stdio.h>

void main(){
    int n, temp;
    int oct = 0;

    printf("Enter number: ");
    scanf("%d", &n);

    temp = n;

    while(temp != 0){
        int rem = temp % 8;
        temp /= 8;
        oct = oct * 10 + rem;
    }

    // Reverse the oct number
    int rev = 0;
    while(oct != 0){
        rev = rev * 10 + (oct % 10);
        oct /= 10;
    }

    printf("%d", rev);
}