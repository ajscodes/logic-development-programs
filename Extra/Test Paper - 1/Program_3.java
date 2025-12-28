public class Program_3 {
    public static void main(String[] args) {
        String s = "abcba";
        StringBuilder otherString = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--){
            otherString.append(s.charAt(i));
        }

        if(otherString.toString().equals(s)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
