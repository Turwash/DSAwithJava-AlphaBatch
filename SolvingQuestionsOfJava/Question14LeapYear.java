package SolvingQuestionsOfJava;
/*Write a Java program that takes a year from the user and print 
whether that year is a leap year or not.*/
import java.util.*;
public class Question14LeapYear {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Year To Know Its Leap Year or Not : ");
            int Year = sc.nextInt();
            if( Year%4==0 || Year%100==0 || Year%400==0) {
                System.out.println("Hurrrraayyyyy! Its a Leap Year");
            } else {
                System.out.println("NOOOO Its Not A Leap Year");
            }
        }   
    }
}
