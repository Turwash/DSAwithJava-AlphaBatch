package Solving_Questions.Variables_and_DataTypes;
//In a program,input the side of a square.You have to output the area of th square
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter Your Area of Square : ");
            Float Side = sc.nextFloat();
            Float Ans = Side * Side ; 
            System.out.println("Area of Square is : "+Ans);
        }

    }
}
