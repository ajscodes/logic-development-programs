#include<stdio.h>
#include<math.h>

void main(){
    int n, sq, left, right, count = 0, temp, div = 1;

    printf("Enter number: ");
    scanf("%d", &n);

    sq = n * n;
    temp = sq;

    while(temp > 0){
        // int r = temp%10;
        // printf("\n%d", r);
        temp = temp/10;
        //printf("\n%d", temp);
        count++;
    }

    //printf("%d", count/2);

    if(count%2 == 0){
        left = sq / (int)pow(10,(count/2));
        right = sq % (int)(10, (count/2));
    }
    else{
        left = sq / (int)pow(10,(count/2)+1);
        right = sq % (int)pow(10, (count/2)+1);
    }


    printf("%d", left);
    printf("\n%d", right);
}