package LoopsConcept;
import java.util.*;

public class PrimeOptimised {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Enter your number : ");
            int n = sc.nextInt();
            Boolean isPrime = true;

            if(n ==2){
                System.out.println("Your Number is a prime Number");
            } else{
                for(int i = 2; i<=Math.sqrt(n); i++){ //Math.sqrt(n) gives sqaure root of number n 
            
                    if( n % i == 0){ // n is a multiple of i (i is not equal to 1 or n )
                        isPrime = false;
                    } 
                }
                if (isPrime == true){
                    System.out.println("Your Number is a prime Number");
                } else {
                    System.out.println("Your Number is Not Prime ");
                }
            }
          
    }
}
}
