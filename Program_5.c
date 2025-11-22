#include<stdio.h>

void main(){
    int n, count = 0;
    printf("Enter number: ");
    scanf("%d", &n);

    for(int i = 0; i*(i+1) <= n; i++){
        if(i*(i+1) == n){
            count = 1;
            break;
        }
    }

    if(count == 1){
        printf("Pronic");
    }
    else{
        printf("NOT Pronic");
    }
}