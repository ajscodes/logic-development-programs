#include<stdio.h>
void main(){
    int n, k, pair = 0;
    printf("Enter size: ");
    scanf("%d", &n);

    printf("Enter sum: ");
    scanf("%d", &k);

    int arr[100];

    for(int i = 0; i < n; i++){
        printf("Element %d: ", i);
        scanf("%d", &arr[i]);
    }

    printf("\n");
    printf("Total pairs: ");
    printf("\n");
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(k == (arr[i] + arr[j])){
                printf("(%d,%d)", arr[i], arr[j]);
                printf("\n");
                pair++;
            }
        }
    }

    printf("Count of pairs: %d", pair);
}