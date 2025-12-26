#include<stdio.h>

void main(){
    int a = 7, count = 0;
    for(int i = 1; i <= a; i++){
        if(a%i == 0){
            count++;
        }
    }

    if(count == 2){
        printf("Yeah");
    }
    else{
        printf("Nope");
    }
}