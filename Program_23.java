//rotate array
public class Program_23 {
    public static void main(String[] args) {
        int k = 5, count = 0, index = 0;
        int []arr = {1,2,3,4,5,6,7,11,18,3,96,27};
        int []result = new int[arr.length];

        for(int i = arr.length - k; i < arr.length; i++){
            result[index++] = arr[i];
            
            count++;
            
            if(count == k){
                break;
            }
        }

        for(int i = 0; i < (arr.length - count); i++){
            result[index++] = arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
