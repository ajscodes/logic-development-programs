import java.util.Scanner;

public class Program_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row of A: ");
        int n = sc.nextInt();

        System.out.print("Enter column of A: ");
        int m = sc.nextInt();

        System.out.print("Enter row of B: ");
        int x = sc.nextInt();

        System.out.print("Enter column of B: ");
        int y = sc.nextInt();

        int A[][] = new int[n][m];
        int B[][] = new int[x][y];
        int C[][] = new int[n][y];

        

        if(m != x){
            System.out.println();
            System.out.println("Error: Multiplication of matrix not possible.");
        }
        else{
            System.out.println();
            System.out.println("Enter elements of matrix A: ");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    A[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("Enter elements of matrix A: ");
            for(int i = 0; i < x; i++){
                for(int j = 0; j < y; j++){
                    B[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < y; j++){
                    C[i][j] = 0;
                    for(int k = 0; k < m; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < y; j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
