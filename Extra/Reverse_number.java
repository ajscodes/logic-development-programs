import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int temp = n;

        int result = 0;

        while(temp != 0){
            result = result * 10 + (temp % 10);
            temp /= 10;
        }
        
        System.out.println(result+"");
    }
}