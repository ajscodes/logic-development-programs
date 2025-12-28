//disarium

public class Program_4 {
    public static void main(String[] args) {
        int n = 175;
        int temp = n;
        int i = 1, sum = 0;
        int count = 0;

        while(temp != 0){
            int x = temp % 10;
            count++;
            temp /= 10;
        }

        int power = 1;
        int temp2 = n;
        // System.out.println(count);

        while (temp2 != 0) {
            int x = temp2 % 10;
            sum = sum + (int)Math.pow(x,count);
            count--;
            temp2 /= 10;
            
        }

        if(sum == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
