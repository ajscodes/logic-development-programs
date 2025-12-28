//armstrong or not

public class Program_1{
    public static void main(String []args){
        int n = 153;
        int lengthOfNumber = countLength(n);

        int temp = n, sum = 0;
        while(temp != 0){
            int x = temp % 10;
            sum = sum + (int)Math.pow(x, lengthOfNumber);
            temp /= 10;
        }

        if(sum == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static int countLength(int temp){
        int count = 0;

        while(temp != 0){
            int x = temp % 10;
            count++;
            temp = temp / 10;
        }

        return count;

    }
}