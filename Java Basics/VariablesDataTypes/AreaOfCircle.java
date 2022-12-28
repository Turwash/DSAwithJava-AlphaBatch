package VariablesDataTypes;
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter your Area Of Circle: ");
            float Radius = sc.nextInt();
            float Area = 3.14f * Radius * Radius ; // f is used to make value float else it takes it as double by itself
            System.out.println("Your Area Of Circle is: "+Area);
        }
    }
}
