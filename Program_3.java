

// import java.util.Scanner;

// public class Program_3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int n = sc.nextInt();

//         if(n < 0){
//             System.out.println("Negative numbers not allow.");
//         }
//         else{
//             int result = checkKaprekar(n);

//             if(result == 0){
//                 System.out.println("Kaprekar");
//             }
//             else{
//                 System.out.println("NOT Kaprekar");
//             }
//         }

//         sc.close();
//     }

//     static int checkKaprekar(int n){
//         int sq = n*n;

//         int arr[] = new int[100];

//         int i = 0, temp = 0, number1 = 0, number2 = 0;
//         while(sq != 0){
//             arr[i] = sq%10;
//             sq = sq/10;
//             i++;
//             temp += i;
//         }

//         for(i = temp; i > Math.floor(temp/2) + 1; i--){
//             number1 = number1 * 10 + arr[i];
//             System.out.println(number1);
//         }

//         for(int j = (int)Math.floor(temp/2) + 1; j > 0; j--){
//             number2 = number2 * 10 + arr[j];
//             System.out.println(number2);
//         }

//         if(number1 + number2 == n){
//             return 0;
//         }
//         else{
//             return 1;
//         }
//     }
// }
