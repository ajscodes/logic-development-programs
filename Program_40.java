import java.util.Arrays;
import java.util.Scanner;

public class Program_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        for(int i = 0; i < n; i++){
            System.out.print("Enter "+i+"th element of first array: ");
            a[i] = sc.nextInt();
        }
        System.out.println();

        for(int i = 0; i < m; i++){
            System.out.print("Enter "+i+"th element of second array: ");
            b[i] = sc.nextInt();   
        }
        System.out.println();

        Arrays.sort(a);
        Arrays.sort(b);

        int[] mergedArray = mergeArray(a, b, n, m);
        System.out.println(Arrays.toString(mergedArray));

        int size = n+m;

        if(size % 2 == 0){
            int d = (size/2) - 1;
            int f = (size/2);
            System.out.println("Median = "+(mergedArray[d] + mergedArray[f])/2);
        }
        else{
            int s = (size+1)/2 - 1;
            System.out.println("Median = "+mergedArray[s]);
        }

        sc.close();                         
    }

    public static int[] mergeArray(int a[], int b[], int n, int m){
        int c[] = new int[n+m];
        int i = 0, j = 0, k = 0;

        while(i < n && j < m){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }
            else if(a[i] > b[j]){
                c[k++] = b[j++];
            }
            else{
                c[k++] = a[i++];
                c[k++] = b[j++];
            }
        }

        //remaining of a[]
        while (i < n) {
            c[k++] = a[i++];
        }

        //remaining of b[]
        while (j < m) {
            c[k++] = b[j++];
        }

        return c;
    }
}
