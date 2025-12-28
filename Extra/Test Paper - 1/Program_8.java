public class Program_8 {
    public static void main(String[] args) {
        int []arr = {220,284,1184,1210,10,20,130};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int a = arr[i];
                int b = arr[j];

                if(sumOfDivisor(a) == b && sumOfDivisor(b) == a){
                    System.out.println(a+" & "+b+" amicable pair.");
                }
                

            }
        }
    }   

    public static int sumOfDivisor(int temp){
            int sum = 0;
            for(int i = 1; i <= temp/2; i++){
                if(temp % i == 0){
                    sum += i;
                }
            }

            return sum;
        }
}
