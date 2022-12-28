package Solving_Questions.Variables_and_DataTypes;
/* Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. 
You have to output the total cost of the items back to the user as their bill 
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter Cost of Pencil : ");
            Float a = sc.nextFloat();
            System.out.println("Enter Cost of Pen : ");
            Float b = sc.nextFloat();
            System.out.println("Enter Cost of Eraser : ");
            Float c = sc.nextFloat();
            float ans = a+b+c ; 
            System.out.println("Your Total Cost :"+ans);
            float gst = (ans*18)/100;
            //Add on - with 18% tax float FinalCost = ans+ (0.18f * ans);
            System.out.println("Your Gst Included : "+gst);
            float FinalCost = gst + ans ; 
            System.out.println("Your Total Bill is" +FinalCost);
        }
    }
}
