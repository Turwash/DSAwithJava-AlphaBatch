package ConditionalStatements;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First Number : ");
            int Num1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int Num2 = sc.nextInt();
            System.out.print("Enter Character Operator To Calculate : ");
            char Operator = sc.next().charAt(0); //charAt(0) is used to make sc.next compatible for Char data type 
            switch (Operator){
                case '+' : System.out.println(Num1 + Num2);
                break;
                case '-' : System.out.println(Num1 - Num2);
                break;
                case '*' : System.out.println(Num1 * Num2);
                break;
                case '/' : System.out.println(Num1 / Num2);
                break;
                case '%' : System.out.println(Num1 % Num2);
                break;
                default: System.out.println("You entered wrong Operator");
            }
        }
    }
    
}
