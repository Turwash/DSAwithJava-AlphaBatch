package VariablesDataTypes;
import java.util.*;


public class InputInJava {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            System.out.println(input);

            /* 
            int number = sc.nextInt();
            System.out.println(number);
            */
        }
    }
}



// Notes: 


//Taking input from the user, from class Scanner 
// MUST IMPORT java.util.*; package For Using Scanner class
/* 
 * next - Only Takes String before space , after space ignores all 
 * nextLine - For whole sentence and everything in paragraph
 * nextInt - For integer
 * nextByte 
 * nextFloat
 * nextDouble
 * nextBoolean
 * nextShort
 * nextLong
 */