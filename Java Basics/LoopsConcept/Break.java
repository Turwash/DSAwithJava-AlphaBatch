package LoopsConcept;
import java.util.*;

public class Break {
    public static void main(String[] args) {
        for(int i = 0 ; i<=10 ; i++){
            if(i == 3 ){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");

        //Function Calling
        Breakuser();
    }



    // Keep Entering Numbers till user enters a multiple of 10
    

    static void Breakuser() {
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter Your Number To Print : ");
         do{
            int n = sc.nextInt();

            if( n % 10 == 0 ){
                System.out.println("You entered Multiple of 10 ");
                break;
            }
            
            System.out.println(n);
            System.out.print("Enter Your Next Number: ");

         } while (true);

        }
    }

}
