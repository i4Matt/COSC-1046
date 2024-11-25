import java.io.PrintWriter;
import java.io.IOException;

public class StudenThrow {
    public static void main(String[] args) throws IOException{
        final String PATH = "LAB_6/LoopsAndFiles/src/Student.txt";
        PrintWriter writer = new PrintWriter(PATH);

        try{
            writer.println("Matthew Houle");
            writer.println("COSC-1046");
        }catch(Exception e) {
            System.out.println("FAILED");
        }
        writer.close();
    }
}
