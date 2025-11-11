import java.util.Scanner;

public class Program_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th element: ");
            arr[i] = sc.nextInt();
        }

        int max1, max2, min1, min2;

        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
            min1 = arr[1];
            min2 = arr[0];
        } else if (arr[0] < arr[1]) {
            max1 = arr[1];
            max2 = arr[0];
            min1 = arr[0];
            min2 = arr[1];
        } else {
            max1 = max2 = arr[0];
            min1 = min2 = arr[0];
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] < max1 && (max2 == max1 || arr[i] > max2)) {
                max2 = arr[i];
            }
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] > min1 && (min2 == min1 || arr[i] < min2)) {
                min2 = arr[i];
            }
        }

        System.out.println();
        System.out.println("Max = " + max1);
        System.out.println("Second Max = " + max2);
        System.out.println("Min = " + min1);
        System.out.println("Second Min = " + min2);
        System.out.println("Difference = " + (max2 - min2));

        sc.close();
    }
}
