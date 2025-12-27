import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int oddSum = 0, evenSum = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] % 2 == 0){
                evenSum = evenSum + arr[j];
            }
            else{
                oddSum = oddSum + arr[j];
            }
        }

        System.out.println(oddSum+" & "+evenSum);
    }
}
