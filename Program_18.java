import java.util.Arrays;

public class Program_18 {
    public static void main(String[] args) {
        int arr1[] = {1,2,5,6,8,4,1,2,5}; //9 
        int arr2[] = {50,5,9,2,2,4,8,1}; //7
        int result[] = new int[Math.min(arr1.length, arr2.length)];
        int index = 0, i = 0, j = 0;

        Arrays.sort(arr1); //1,1,2,2,4,5,5,6,8
        Arrays.sort(arr2); //1,2,4,5,8,9,50

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                result[index++] = arr1[i];
                i++;
                j++;
            }
            
            else if(arr1[i] < arr2[j]){
                i++;
            }

            else{
                j++;
            }
        }

        for(int x = 0; x < result.length; x++){
            if(result[x] == '\0'){
                break;
            }
             System.out.print(result[x] + " ");
        }
    }
}
