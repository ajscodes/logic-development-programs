import java.util.Scanner;

public class Program_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter "+i+"th element: ");
            arr[i] = sc.nextInt();
        }

        int max1, max2;

        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }
        else if(arr[1] > arr[0]){
            max1 = arr[1];
            max2 = arr[0];
        }
        else{
            max1 = max2 = arr[0];
        }

        for(int i = 2; i < n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && (arr[i] < max1 || max1 == max2)){
                max2 = arr[i];
            }
        }

        if(max2 == max1){
            System.out.print("-1");
        }
        else{
            System.out.println("Max2: "+max2);
        }
        
        sc.close();
    }
}
