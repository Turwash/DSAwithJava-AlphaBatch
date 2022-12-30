package FunctionsAndMethods.BinaryDecimal;
import java.util.*;

public class DecimalBinary {
    

    public static void DectoBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10 , pow));
            pow++;
            n /= 2;
        }
        System.out.println("Binary of " +myNum+ " = " +binNum);

    }



    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System . in )) {
            System.out.println("Write Binary Number to get decimal :");
            int n = sc.nextInt();
            DectoBin(n);

        }
        
    }
}
