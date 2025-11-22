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
        right = sq % (int)round(pow(10,(count/2))); //round can give 100. without round it give 99 in case of count = 4 because 99.99999999999997
    }
    else{
        left = sq / (int)pow(10,(count/2)+1);
        right = sq % (int)round(pow(10,(count/2) + 1));
    }

    // printf("%d", left);
    // printf("\n%d", right);

    if(left + right == n){
        printf("Kaprekar");
    }
    else{
        printf("NOT Kaprekar");
    }
}