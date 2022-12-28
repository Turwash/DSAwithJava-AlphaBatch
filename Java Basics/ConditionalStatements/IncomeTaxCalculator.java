package ConditionalStatements;
import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter Your Income Tax in Lakhs :");
            int income = sc.nextInt();
            int TaxPay;
            if(income < 500000){
                TaxPay = 0;
            }
            else if (income >= 500000 && income <= 1000000 ) {
                TaxPay = (int)(income * 0.2);
            }
            else {
                TaxPay = (int)(income * 0.3);
            }        
            System.out.println("Your Total Tax is : " +TaxPay);
        }
    }
}
