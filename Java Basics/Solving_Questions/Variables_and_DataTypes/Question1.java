package Solving_Questions.Variables_and_DataTypes;
// Inaprogram,input3numbers:A,BandC.You have to output the average of these 3 numbers
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner ( System.in )) {
            System.out.print("Enter First Number : ");
            float a = sc.nextFloat();
            System.out.print("Enter Second Number : ");
            float b = sc.nextFloat();
            System.out.print("Enter Third Number : ");
            float c = sc.nextFloat();
            float d = (a+b+c)/2;
            System.out.println("The average of your three numbers are : "+d);
        }




    }
}
