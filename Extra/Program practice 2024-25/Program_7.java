public class Program_7 {
    public static void main(String[] args) {
        for(int i = 150; i <= 445; i++){
            if(i%2 != 0){
                if(i%7 == 0){
                    if(i%3 != 0){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
