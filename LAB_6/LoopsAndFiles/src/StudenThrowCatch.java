import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudenThrowCatch {
    public static void main(String[] args) {
        final String PATH = "LAB_6/LoopsAndFiles/src/Student.txt";
        try (Scanner scanner = new Scanner(new File(PATH))) {
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {

        }
    }
}
