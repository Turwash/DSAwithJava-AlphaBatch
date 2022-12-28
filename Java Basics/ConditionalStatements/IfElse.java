package ConditionalStatements;
import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter your Age : ");
            int Age = sc.nextInt();
            if (Age>=18){
                System.out.println("Congratulations!! You are an adult now you can Vote");
            }
            if(Age >= 13 && Age <= 17){
                System.out.println("Heyyyy You are Teenagerrrr");
            }
            else{
                System.out.println("ooopppssss!!! You are not and adult");
            }
        }
    }
} 
