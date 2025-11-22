import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");;
        int n = sc.nextInt();            

        int slow = n, fast = n;

        //this is floyd cycle detection technique
        while(true){
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));

            if(slow == 1 || fast == 1){
                System.out.println("Happy number");
                break;
            }

            if(slow == fast){
                System.out.println("NOT Happy");
                break;
            }
        }
    }

    public static int sumOfSquare(int num){
        int sum = 0;
        int temp = num;
        while(temp > 0){
            int rem = temp % 10;
            sum = sum + rem * rem;
            temp = temp / 10;
        }
        return sum;
    }
}
