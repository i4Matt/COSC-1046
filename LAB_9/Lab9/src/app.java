import java.util.StringTokenizer;

public class app {
    
    // --- TASK 1 START --- //
    public static int findSmallestInt(int num1, int num2, int num3){
        int num[] = {num1, num2, num3};
        int result = num[0];

        for (int i = 1; i < num.length; i++){
            if (num[i] > result){
                result = num[i];
            }
        }
        return result;
    }

    // --- TASK 1 FINISH --- //



    // --- TASK 2 START --- //
    public static int wordCount(String txt){
        int total = 0;

        StringTokenizer tokenizer = new StringTokenizer(txt, " ");

        while (tokenizer.hasMoreTokens()){
            total++;
            tokenizer.nextToken();
        }

        return total;
    }
    // --- TASK 2 FINISH --- //


    
    // --- TASK 3 START --- //
    public static boolean digitsIsEven(int input){
        String numTxt = Integer.toString(input); // TURNS INT INTO STRING
        boolean result = true; // IF ANY NUMBER IS ODD IT WILL TURN FALSE.

        // LOOP THAT GOES THROUGH EACH NUMBER AND CHECKS IF IT IS EVEN OR ODD.
        for (int i = 0; i < numTxt.length() && result; i++){
            char number = numTxt.charAt(i);

            if (Character.getNumericValue(number) % 2 == 1){
                result = false;
                break; // NO NEED TO CONTINUE THE LOOP IF A NUMBER IS ODD.
            }
        }
        return result;
    }
    // --- TASK 3 FINISH --- //


    
    // --- TASK 4 START --- //
    public static void shineBrightLikeADiamond(int size){
        if (size > 10){size = 9;}

        for (int i = 0; i <= size; i++){
            for (int j = size; j >= -size; j--){
                if (j==0 || j==-1){continue;}
                if (Math.abs(i) < Math.abs(j)){
                    System.out.print(" ");
                }else{
                    System.out.print(Math.abs(j));
                }
            }
            System.out.println();
        }
        
        for (int i = size - 1; i >= 0; i--){
            for (int j = size; j >= -size; j--){
                if (j==0 || j==-1){continue;}
                if (Math.abs(i) < Math.abs(j)){
                    System.out.print(" ");
                }else{
                    System.out.print(Math.abs(j));
                }
            }
            System.out.println();
        }
    }
    // --- TASK 4 FINISH --- //


    
    // --- MAIN PROGRAM START --- //
    public static void main(String[] args){
        System.out.println(findSmallestInt(305, 20, 0) + "\n"); // TASK 1
        System.out.println(digitsIsEven(0) + "\n"); // TAKS 2
        System.out.println(wordCount("The quick brown fox jumps over the lazy dog, showing off its agility and speed with grace and ease.") + "\n"); // TASK 3

        shineBrightLikeADiamond(7);


    }
}
