#include<stdio.h>

void main(){
    int n, count = 0, temp, extract, sq, div = 1;
    printf("Enter number: ");
    scanf("%d", &n);

    if(n < 0){
        printf("Negative not allow.");
        return;
    }
 
    temp = n;
    while(temp > 0){
        temp = temp / 10;
        count++;
    }

    sq = n * n;

    for(int i = 0; i < count; i++){
        div = div * 10;
    }

    extract = sq % div;

    //printf("%d", extract);
    //printf("%d", count);

    if(n == extract){
        printf("Automorphic");
    }
    else{
        printf("NOT Automorphic");
    }

}