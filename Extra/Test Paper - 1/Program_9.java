public class Program_9 {
    public static void main(String[] args) {

        int rows = 5;
        char ch = 'A';
        int num = 1;

        for(int i = 1; i <= rows; i++){

            // print spaces
            for(int s = rows; s > i; s--){
                System.out.print(" ");
            }

            // print values
            for(int j = 1; j <= i; j++){
                if(i % 2 == 1){          // odd row
                    System.out.print(ch + " ");
                    ch++;
                } else {                 // even row
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}