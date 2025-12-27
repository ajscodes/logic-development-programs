#include<stdio.h>

void main(){
    FILE *f1, *f2;
    int ch;

    f1 = fopen("Program_8.c","r");
    f2 = fopen("code.txt","w");

    if(f1 == NULL || f2 == NULL){
        printf("File error");
        return;
    }

    while(((ch = fgetc(f1)) != EOF)){
        fputc(ch,f2);
    }

    fclose(f1);
    fclose(f2);
}