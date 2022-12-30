package FunctionsAndMethods.FunctionOverLoading;

import java.util.*;

public class FunctionOverloadingDatatypes {

    // Function to calculate sum of 2 numbers in Integer Value
    public static int sum(int a , int b) {
        return a+b;
        
    }

    // Function to calculate sum of 2 numbers in Float Value
    public static float sum(float a , float b ) {
        return a+b;
        
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter Your First Number : ");
            int a = sc.nextInt();
            System.out.print("Enter Your Second Number : ");
            int b = sc.nextInt();
            int sum1 = sum(a,b);
            System.out.println("sum of a and b Int: "+sum1);

            System.out.print("Enter Your First Number : ");
            float c = sc.nextFloat();
            System.out.print("Enter Your Second Number : ");
            float d = sc.nextFloat();
            float sum2 = sum(c,d);
            System.out.println("sum of a and b Float: "+sum2);

        }
       
    }
}
