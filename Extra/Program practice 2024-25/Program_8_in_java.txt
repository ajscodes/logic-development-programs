import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program_8 {
    public static void main(String[] args) throws IOException {
        FileReader f1 = new FileReader("Program_8.java");
        FileWriter f2 = new FileWriter("Program_8_in_java.txt");

        int ch;
        while ((ch = f1.read()) != -1) {
            f2.write(ch);
        }

        f1.close();
        f2.close();
    }
}
