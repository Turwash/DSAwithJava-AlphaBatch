package Solving_Questions.Conditional_Statements;
/* Write a Java program to input week number(1-7) 
and print day of week name using switch case.*/
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Day Number:");
            int Num = sc.nextInt();
            switch(Num){
                case 1 : System.out.println("Its, Monday");
                break;
                case 2 : System.out.println("Its, Tuesday");
                break;
                case 3 : System.out.println("Its, Wednesday");
                break;
                case 4 : System.out.println("Its, Thursday");
                break;
                case 5 : System.out.println("Its, Friday");
                break;
                case 6 : System.out.println("Its, Saturday");
                break;
                case 7 : System.out.println("Its, Sunday");
                break;
                default: System.out.println("Enter Number Between 1 to 7");
            }
        }
    }
    
}
