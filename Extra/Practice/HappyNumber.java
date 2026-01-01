package Practice;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 49;

        int result = n;
        while(result != 1 && result != 4){
            result = sumOfSquare(result);
        }

        if(result == 1){
            System.out.println("Happy");
        }
        else{
            System.out.println("NOT");
        }
    }

    public static int sumOfSquare(int n){
        int sum = 0;
        while(n != 0){
            int temp = n % 10;
            sum = sum + temp * temp;
            n = n / 10;
        }

        return sum;
    }
}
