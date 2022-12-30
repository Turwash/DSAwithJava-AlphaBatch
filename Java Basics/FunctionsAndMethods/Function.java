package FunctionsAndMethods;
import java.util.*;

public class Function {
  



public static void sumFunction(int num1 , int num2){
        int sum = num1 + num2;
        System.out.println("Your Sum Is : " +sum);

}


public static void main(String[] args) {

    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter Your First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Your Second Number : ");
        int b = sc.nextInt();
        sumFunction(a,b);
    }
    
}

}
  