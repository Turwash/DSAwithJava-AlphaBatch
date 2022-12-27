package ConditionalStatements;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Number To Get Desired Food : ");
            int Num = sc.nextInt();
            switch (Num) {
                case 1: System.out.println("You Ordered Samosa");
                break;
                case 2: System.out.println("You Ordered Pizza");
                break;
                case 3: System.out.println("You Ordered Sandwich");
                break;
                case 4: System.out.println("You Ordered Pasta");
                break;
                case 5: System.out.println("You Ordered Maggie");
                break;
                case 6: System.out.println("You Ordered Coffee");
                break;
                case 7: System.out.println("You Ordered Chicken");
                break;
                case 8: System.out.println("You Ordered Paneer Butter masala");
                break;
                case 9: System.out.println("You Ordered Biryani");
                break;
                case 10: System.out.println("You Ordered Soup");
                break;
                default: System.out.println("You Entered Wrong Number, Enter B/w 1 to 10");

            }
        }
    }
}
