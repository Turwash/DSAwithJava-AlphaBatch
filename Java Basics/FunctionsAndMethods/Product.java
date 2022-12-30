package FunctionsAndMethods;
import java.util.*;


public class Product {

    public static int multiply(int a , int b ){
        int product = a * b ;
        return product;
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First Number : ");
            int a = sc.nextInt();
            System.out.print("Enter First Number : ");
            int b = sc.nextInt();
            int prod =  multiply(a ,b);
            System.out.println("Your Product is : "+prod);

        }
            
        }

    
        
    }
