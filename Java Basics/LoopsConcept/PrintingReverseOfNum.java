package LoopsConcept;
import java.util.*;

public class PrintingReverseOfNum {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n /= 10;
        
        }
        System.out.println(rev);

        //FunctionCalling
        ReverseTakingInput();
    }

    // Printing rev by taking input
    static void ReverseTakingInput() {
        try(Scanner sc  = new Scanner (System.in)){
            System.out.print("Enter Your Number To Get Reversed : ");
            int num = sc.nextInt();
            int rev = 0;

            while (num>0){
                int last = num % 10;
                rev = (rev*10) + last;
                num /= 10;
            }
            System.out.println(rev);
        }
}
}
