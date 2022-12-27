package ConditionalStatements;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        try (Scanner sm = new Scanner(System.in)) {
            System.out.print("Enter your number to get its Odd or Even : ");
            int Num = sm.nextInt();
            if(Num % 2 ==0){
                System.out.println("Your Number is EVEN");
            }
            else {
                System.out.println("Your Number is ODD");
            }
        }
    }
}
