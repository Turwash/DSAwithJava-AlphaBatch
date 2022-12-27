package ConditionalStatements;
import java.util.*;
public class LargestOfThree {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter Your First Number : ");
            int Num1 = sc.nextInt();
            System.out.print("Enter Your Second Number : ");
            int Num2 = sc.nextInt();
            System.out.print("Enter Your Third Number : ");
            int Num3 = sc.nextInt();
            if(Num1 >= Num2 && Num1 >= Num3){
                System.out.println("Your First Number is Greater i.e " +Num1);
            }
            else if(Num2 >= Num3 ) {
                System.out.println("Your Second Number is Greater i.e " +Num2);
            }
            else {
                System.out.println("Your Third Number is Greater i.e "+Num3);
            }
        }
    }
}
