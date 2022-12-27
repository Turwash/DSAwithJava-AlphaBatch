package TypeConversionTypeCastingAndTypePromotion;

import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 25; // Source
        long b = a; // Destination 
        System.out.println(b); // This type conversion is possible as Destination > source

        /* This below conversion is not possible and is called  LOSSY CONVERSION
        long a = 25;
        int b = a;
        System.out.println(b);
        Destination < Source so lossy as data will be lost as can't be stored. 
        */

        try (Scanner sc = new Scanner (System.in)) {
            float abc = sc.nextInt(); //This is possible, we can assign Int to Float
           // int bcd = sc.nextFloat(); -> Lossy Conversion as we annot assign Float to Int 
            System.out.println(abc); 
        }
    }
}


// Notes: 

// Type conversion is also called Widening Conversion and Implicit Conversion 

/* Type Conversion Happens When :
a) Type compatible i.e int to float not int to boolean 
b) Destination type > Source type


byte -> short -> int -> float -> long -> double 
 */