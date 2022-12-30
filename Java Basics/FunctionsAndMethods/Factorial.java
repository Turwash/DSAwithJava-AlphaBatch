package FunctionsAndMethods;
import java.util.*;


public class Factorial {

    public static int Fact(int a ){
        int Fact = 1;
        for( int i = 1; i <= a ;i++){
            Fact = Fact * i;
        }
        return Fact;
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number : ");
            int a = sc.nextInt();
            int Ans =  Fact(a);
            System.out.println("Your Factorial is : "+Ans);

        }
            
        } 
    }
