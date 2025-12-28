//2d array all type of sum

import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row: ");
        int n = sc.nextInt();

        System.out.println("Enter column: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("arr["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            int rowSum  = 0;
            for(int j = 0; j <m; j++){
                rowSum = rowSum + arr[i][j];
            }
            System.out.println("Row "+i+" sum "+rowSum);
        }

        for(int j = 0; j < m; j++){
            int colSum = 0;
            for(int i = 0; i < n; i++){
                colSum = colSum + arr[i][j];
            }
            System.out.println("Column "+j+" sum "+colSum);
        }

        int totalRowSum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                totalRowSum += arr[i][j];
            }
        }
        System.out.println("Total row sum "+totalRowSum);

        int totalColSum = 0;
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n;i++){
                totalColSum += arr[i][j];
            }
        }
        System.out.println("Total Column sum "+totalColSum);
    }
}
