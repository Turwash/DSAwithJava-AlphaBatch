package LoopsConcept;
import java.util.*;

public class WhileLoop {
    public static final Scanner sc = new Scanner (System.in); //Global Scanner
    
    public static void main(String[] args) {
        int Counter = 0; 
        while (Counter < 10){
            System.out.println("Hellow World");
            Counter++; //Increase Value of counter so that it will loop till the condition
        }
        System.out.println("Printed Hellow world 10 Times"); //This code will be unreachable if its infinity loop
       
    // Function Calling
    OnetoHundred();  
    UserInputRange();
    SumOfNaturalNumbers();
    PatternSquare();
}

// One to Hundered Printing Numbers 
static void OnetoHundred() {
    System.out.println("Printing 1 to 100 Numbers");
    int ans = 1;
    while(ans <= 100){
    System.out.print(ans+" ");
    ans++;
    }
    System.out.println();
}

// Print numbers to certain Range 

static void UserInputRange() {
    System.out.print("Enter Your Range To Print Numbers : ");
    int Num = 1 ; 
    int Ans = sc.nextInt();
    while(Num <= Ans){
        System.out.print(Num+ " ");
        Num++;
    }
    System.out.println();
}


// Sum for N natural Numbers 

static void SumOfNaturalNumbers() {
    System.out.println("Enter Range of Natural Number to get SUM : ");  
    int Number = sc.nextInt();
    int sum = 0 ;

    int i = 1; // i is called iterator 
    while (i <= Number){
        sum += i; 
        i++;
    }
    System.out.println("Sum is : " +sum);
}

// Printing Square Pattern in while
static void PatternSquare() {
    int i = 1;
    while(i <= 4){
        System.out.println("* * * *");
        i++;
    }
}

}
