package VariablesDataTypes;

import java.util.*;

public class SumAndProductByInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter your First Number");
            int a = sc.nextInt();
            System.out.println("Enter your Second Number");
            int b = sc.nextInt();
            int sum = a + b ;
            int Pro = a * b; 
            System.out.println("Your Sum is: " +sum);
            System.out.println("Your Product is : " +Pro);

           
        }

        }
    }
