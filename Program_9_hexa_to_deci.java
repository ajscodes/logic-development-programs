import java.util.Scanner;

public class Program_9_hexa_to_deci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hexa: ");
        String h = sc.nextLine();

        h = h.toUpperCase();

        int result = 0, i = h.length() - 1, j = 0;
        boolean show_result = true;

        while(i >= 0){
            char ch = h.charAt(i);

            if(ch >= '0' && ch <= '9'){
                result = (int) (result + (ch - '0') * Math.pow(16, j)) ;
                j++;
            }
            else if(ch >= 'A' && ch <= 'F'){
                result = (int) (result + (10 + (int)(ch - 'A')) * Math.pow(16, j));
                j++;
            }
            else{
                show_result = false;
                break;
            }

            i--;
        }

        if(show_result){
            System.out.print(result);
        }else{
            System.out.println("Invalid character.");
        }
        

        sc.close();
    }
}