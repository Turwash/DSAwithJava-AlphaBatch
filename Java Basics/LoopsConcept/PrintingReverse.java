package LoopsConcept;
import java.util.*;
/* Concept :- 
  1) USE MODULO -> as any number divided by 10 gives remainder 
  of its last digit i.e 523 % 10 = 3. we will print this for reverse
  2) THEN DIVIDE -> as if we want to remove the last digit of 
  any number we divide it with 10. i.e 523 / 10 = 52. (we will not print this)
  and use this in a LOOP....
 */
public class PrintingReverse {
    public static void main(String[] args) {
        int n = 10899;

        while(n > 0) {
        int lastDigit = n % 10 ;
        System.out.print(lastDigit);
        n = n / 10 ; // or  n/=10;

        }
        System.out.println();
        
        //FunctionCalling
        ReverseTakingInput();
    }


    // User input reverse 

    static void ReverseTakingInput() {
        try(Scanner sc  = new Scanner (System.in)){
            System.out.print("Enter Your Number To Get Reversed : ");
            int num = sc.nextInt();
            while (num>0){
                int last = num % 10;
                System.out.print(last);
                num /= 10;
            }
            System.out.println();
        }
    }
}
