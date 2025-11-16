import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("NOT ugly.");
        }else{
            while(n%2 == 0 || n%3 == 0 || n%5 ==0){
                if(n%2 == 0){
                    n /= 2;
                }
                else if(n%3 == 0){
                    n /= 3;
                }
                else if(n%5 == 0){
                    n /= 5;
                }
            }

            if(n == 1){
                System.out.println("Ugly number.");
            }
            else{
                System.out.println("NOT ugly.");
            }
        }

        sc.close();
    }
}
