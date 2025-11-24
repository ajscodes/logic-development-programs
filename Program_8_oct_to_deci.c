#include<stdio.h>
#include<math.h>

void main(){
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    int temp = n, result = 0, count = 0;
    while(temp != 0){
        int rem = temp % 10;
        result = result + rem * pow(8,count);
        temp /= 10;
        count++;
    }

    printf("%d", result);
}