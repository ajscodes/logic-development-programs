public class Program_5{
    public static void main(String []args){
        int start = 0, add = 1, n = 5;
        for(start = 1; start <= n; start++){
            int sum = 0;
            for(add = 1; add <= start; add++){
                sum = sum + add;
            }

            System.out.println(sum);
        }
    }
}