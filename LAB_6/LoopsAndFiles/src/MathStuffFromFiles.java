import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MathStuffFromFiles {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10];

        // TAKE ALL VALUES AND PUT THEM INTO AN ARRAY
        final String NUMBERSPATH = "LAB_6/LoopsAndFiles/src/Numbers.txt";
        try (Scanner scanner = new Scanner(new File(NUMBERSPATH))) {
            int count = 0;
            while (scanner.hasNextLine()){
                numbers[count] = (int) Integer.parseInt(scanner.nextLine());
                count++;
            }
        } catch (IOException e) {}


        // SORT ARRAY
        for (int i = 0; i < numbers.length ; i++){
            for (int j = i; j < numbers.length ; j++){
                if (numbers[i] > numbers[j]){
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // FIND THE MEAN
        int total = 0;
        for (int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }

        int mean = total / numbers.length;

        // FIND THE DEVIATION
        int deviation = 0; // IDK MAN


        // FIND THE MEDIAN
        float median = 0;
        if (numbers.length % 2 == 0){
            int temp = (int) Math.floor(numbers.length / 2);
            median = (numbers[temp] + numbers[temp + 1]) / 2f;
        }

        // FIND THE MODE
        String mode = "";
        for (int i = numbers[0]; i < numbers[9]; i++){
            int modeCount = 0;
            for (int j = 0; j < numbers.length; j++){
                if (i == numbers[j]){
                    modeCount++;
                }
            }
            if (modeCount > 0){
                mode = mode + " " + i + "(" + modeCount + ")"; 
            }
        }

        // PRINT TO FILE
        final String WRITEPATH = "LAB_6/LoopsAndFiles/src/Results.txt";
        PrintWriter writer = new PrintWriter(WRITEPATH);

        try{
            writer.println("Mean is: " + mean);
            writer.println("Deviation is: " + deviation);
            writer.println("Median is: " + median);
            writer.println("Mode is: " + mode);
        }catch(Exception e) {
            System.out.println("FAILED");
        }
        writer.close();
    }
}
