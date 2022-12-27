package ExtraImpConcepts;

/*When we are using more functions in a code and we need scanners in all the function
then we should use Global Scanner class for all the functions and not to write
Scanner again and again in each and every functions
else it will give error: Exception in thread "main" java.util.NoSuchElementException */

import java.util.*;

    public class GlobalScanner {
        public static final Scanner sc = new Scanner(System.in); //One line code for all functions
    
    public static void main(String[] args) {
                
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
                OddEven();
               PrintLargest();
               }

static void OddEven() {
        System.out.print("Enter your number to get its Odd or Even : ");
        int Num = sc.nextInt();
        if(Num % 2 ==0){
            System.out.println("Your Number is EVEN");
        }
        else {
            System.out.println("Your Number is ODD");
        }
    }



static void PrintLargest() {
        System.out.print("Enter Your First Number: ");
        int Number = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int Number2 = sc.nextInt();
        if (Number == Number2){
            System.out.println("Both Number Are SAME");
        } 
        else if(Number > Number2){
            System.out.println("First Number is Greater, i.e "+Number);
        }
        else{
            System.out.println("Second Number is Greater i.e " +Number2);
        }

    }
}