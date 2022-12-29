package Solving_Questions.Loops_Questions;
/*Write a program that reads a set of integers, 
and then prints the sum of the even and odd integers*/
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int number;
        int count;
        int evenSum = 0;
        int oddSum = 0;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Lets Start");
            do{
                System.out.print("Enter Your number : ");
                number = sc.nextInt();
                if(number % 2 == 0){
                    evenSum += number ;
                    
                } else {
                    oddSum += number;
                    
                }
                
                System.out.print("If you want to continue press 1 for yes else 0 for no: ");
                count = sc.nextInt();



            } while(count == 1);

            System.out.println("Your Even Number sum is: "+evenSum);
            System.out.println("Your Odd Number sum is: "+oddSum);
        }
        
    }
}
