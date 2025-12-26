public class Program_1{
    public static void main(String []args){
        int a = 120, b = 4000, c = 550;
        int max = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
        System.out.println(max);
    }
}