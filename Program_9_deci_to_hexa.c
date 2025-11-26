    #include<stdio.h>

    int main(){
        int n;
        printf("Enter Decimal: ");
        scanf("%d", &n);

        if(n == 0){
            printf("0");
            return 0;
        }

        int temp = n;
        char result[100] = "";
        int index = 0;

        while(temp != 0){
            int rem = temp % 16;
            temp = temp / 16;

            if(rem < 10){
                result[index++] = '0' + rem;
            }else{
                result[index++] = 'A' + (rem-10);
            }
        }

        result[index] = '\0';

        for(int i = index - 1; i >= 0; i--){
            printf("%c", result[i]);
        }

        return 0;
    }