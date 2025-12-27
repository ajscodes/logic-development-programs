public class Program_3 {
    public static void main(String[] args) {
        int n = 3456543;
        int temp = n;
        int rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
