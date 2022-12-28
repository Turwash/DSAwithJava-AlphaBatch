package OperatorsInJava;
import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your Number : ");
            int Number = sc.nextInt();
            String Num = (Number % 2 == 0) ? "Even" : "Odd";
            System.out.println("Your Nummber is : "+Num);
        }
        
        
    }
}
