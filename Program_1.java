import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        CheckPrime check = new CheckPrime();
        int result = check.isPrime(n);

        if(result == 1){
            System.out.print("Not Prime");
        }
        else{
            System.out.print("Prime");
        }

        sc.close();
    }
}

class CheckPrime{
    int isPrime(int n){

        if(n <= 1) return 1;

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return 1;
            }
        }

        return 0;
    }
    
}
