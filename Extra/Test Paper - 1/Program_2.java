//prime factor

public class Program_2 {
    public static void main(String[] args) {
        int n = 12;

        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int n){

        if(n < 2)
            return false;

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}