package FunctionsAndMethods;
import java.util.*;
public class Function2 {
    
// here we have taken int as return type


    public static int sumFunction(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
}


public static void main(String[] args) {

    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter Your First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Your Second Number : ");
        int b = sc.nextInt();
        int sum = sumFunction(a,b);
        System.out.println("Your sum is : "+sum);
        
    }
    
}
    
}
