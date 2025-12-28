public class Program_10 {
    public static void main(String[] args) {
        int position = 11;
        int count = 0;

        for(int num = 1; ; num++){
             
            String s = num + "";

            for(int i = 0; i < s.length(); i++){
                count++;

                if(count == position){
                    System.out.println(s.charAt(i));
                    return;
                }
            }
        }
    }
}
