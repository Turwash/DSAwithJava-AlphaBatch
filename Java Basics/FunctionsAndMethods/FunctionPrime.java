package FunctionsAndMethods;
import java.util.*;
public class FunctionPrime {

    //only for greater than 2
    public static Boolean Prime(int a) {

        //for 2
        if(a ==2){
            return true;
        }
        
        for(int i = 2; i<=a-1 ; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
       
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter Your Number To Check Prime or Not : ");
            int a = sc.nextInt();
            boolean Ans = Prime(a);
            System.out.println(Ans);
        }
    }
    
}
