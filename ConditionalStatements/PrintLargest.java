package ConditionalStatements;
import java.util.*;
public class PrintLargest {
    public static void main(String[] args) {
            try(Scanner sm = new Scanner(System.in)) {
            System.out.print("Enter Your First Number: ");
            int Number = sm.nextInt();
            System.out.print("Enter Your Second Number: ");
            int Number2 = sm.nextInt();
            if (Number>Number2){
                System.out.println("First Number is Greater, i.e "+Number);
            } 
            if(Number == Number2){
                System.out.println("Both Your Entered Numbers are SAME");
            }
            else{
                System.out.println("Second Number is Greater i.e " +Number2);
            }

        }
    }
}
