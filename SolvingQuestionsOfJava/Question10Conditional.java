package SolvingQuestionsOfJava;
/* Write a Java program to get a number from the user 
and print whether it is positive or negative */
import java.util.*;
public class Question10Conditional {
    public static void main(String[] args) { {
            try(Scanner sc = new Scanner(System.in)){
                System.out.print("Enter Your Number : ");
                int Num = sc.nextInt();
                if(Num >= 0) {
                    System.out.println("Your Number is Positive");
                } else {
                    System.out.println("Your Number is Negative");
                }

            }
        }
    }
}
