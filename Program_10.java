import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.print("Enter position (start from 0): ");
        int pos = sc.nextInt();

        System.out.print("Enter element: ");
        int ele = sc.nextInt();
        
        for(int i = arr.length - 1; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = ele;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
