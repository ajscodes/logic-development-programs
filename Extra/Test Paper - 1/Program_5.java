import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder("111");
        
        //7 baase to deci
        int sum = 0, power = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            sum = sum + (s.charAt(i) - '0')*(int)Math.pow(7, power); 
            power++;
        }

        int deci = sum;
        //deci to hex
        String hex = "";
        while(deci != 0){
            int rem = deci % 16;

            if(rem < 10){
                hex = rem + hex;
            }
            else{
                hex = hex + (char)(rem - 10 + 'A');
            }

            deci /= 16;
        }

        System.out.println(hex);
    }
}
