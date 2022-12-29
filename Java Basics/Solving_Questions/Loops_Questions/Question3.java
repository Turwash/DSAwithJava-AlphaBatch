package Solving_Questions.Loops_Questions;
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter Your Number to get Factorial : ");
            int num = sc.nextInt();
            int factorial = 1;
            for(int i = 1; i <= num ;i++){
              factorial *= i;
                
            }
            System.out.println("Your factorial is : "+factorial);
           
        }
       
    }
}
