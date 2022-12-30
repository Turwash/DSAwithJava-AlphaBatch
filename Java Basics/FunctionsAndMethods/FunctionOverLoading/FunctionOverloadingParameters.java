package FunctionsAndMethods.FunctionOverLoading;

import java.util.*;

public class FunctionOverloadingParameters {

    // Function to calculate sum of 2 numbers
    public static int sum(int a , int b) {
        return a+b;
        
    }

    // Function to calculate sum of 3 numbers
    public static int sum(int a , int b , int c) {
        return a+b+c;
        
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter Your First Number : ");
            int a = sc.nextInt();
            System.out.print("Enter Your Second Number : ");
            int b = sc.nextInt();
            System.out.print("Enter Your Third Number : ");
            int c = sc.nextInt();
            int sum1 = sum(a,b);
            int sum2 = sum(a,b,c);
            System.out.println("sum of a and b : "+sum1);
            System.out.println("sum of a , b and c : "+sum2);

        }
       
    }
}
