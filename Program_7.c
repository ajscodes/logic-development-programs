#include<stdio.h>

void main(){
    int hr, min;

    printf("Enter hour: ");
    scanf("%d", &hr);

    printf("Enter minute: ");
    scanf("%d", &min);

    if(hr > 12 || hr < 1){
        printf("Hour must be 1 to 12");
        return -1;
    }else if(min > 59 || min < 0){
        printf("Minute must be 1 to 59");
        return -1;
    }

    double hr_angle = 0, min_angle = 0, final_angle = 0;

    hr_angle = 30 * hr + (0.5 * min);
    min_angle = 6 * min;

    double diff = hr_angle - min_angle;

    if(diff < 0){
        diff = -diff;
    }

    if (diff > 180){
        final_angle = 360 - diff;
    }
    else{
        final_angle = diff;
    }

    printf("Angle: %3.1f", final_angle);
}