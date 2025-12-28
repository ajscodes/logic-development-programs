public class Program_3_basic {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcba");
        int start = 0;
        int end = s.length() - 1;
        boolean flag = true;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                flag = false;
                break;
            }

            start++;
            end--;
        }

        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }

    }
}
