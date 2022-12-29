package LoopsConcept;
import java.util.*;

public class Continue {
    public static void main(String[] args) {
        for(int i = 0 ; i <=10 ; i++){
            if(i == 3){
                continue;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
        //Functioncalling
        Continueuser();
    }
    


    // Display all number entered by user except multiple of 10

    static void Continueuser() {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Number : ");

            do{
                int n = sc.nextInt();
                if( n % 10 == 0){
                    System.out.println("You Entered Multiple of 10 Cnt be printed");
                    System.out.print("Enter Your Next Number : ");
                    continue;
                }
            
            System.out.println("You entered : "+n);
            System.out.print("Enter Your Next Number : ");
            } while(true);
        }
    }

}
