//sum of element using recursion.

public class Program_7 {
    public static void main(String[] args) {
        int arr[] = {1,6,7,8,4};
        int result = sumOfele(arr,0);
        System.out.println(result);
    }

    public static int sumOfele(int[] arr, int index){
        if(index == arr.length){
            return 0;
        }

        return arr[index] + sumOfele(arr, index+1);
    }
}
