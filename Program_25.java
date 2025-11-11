import java.util.Scanner;

public class Program_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount(n) of money: ");
        int n = sc.nextInt();

        System.out.print("Enter price(m) of single chocolate: ");
        int m = sc.nextInt();

        System.out.print("Enter (k) wrapper to get 1 chocolate: ");
        int k = sc.nextInt();

        int total = n/m;
        int wrapper = total;

        while(wrapper >= k){
            int exchange = wrapper / k;
            total += exchange;
            wrapper = exchange + (wrapper % k);
        }
        
        System.out.println("You will get "+total+" chocolates.");
        sc.close(); 
    }
}
