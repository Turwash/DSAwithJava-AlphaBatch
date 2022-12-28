package ConditionalStatements;
import java.util.*;
public class PassFailTernary {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Marks : ");
            int Marks = sc.nextInt();
            String PF = Marks >= 33? "Pass" : "Fail";
            System.out.println("You are : "+PF);

        }
    }
}
