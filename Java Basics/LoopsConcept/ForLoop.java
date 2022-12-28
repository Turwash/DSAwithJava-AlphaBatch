package LoopsConcept;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i<=10 ; i++){
            System.out.println("Hellow World!!");
        }
        System.out.println("Printed 10 Times");
        square();
    }


    // Printing Square Pattern In For Loop 

    static void square() {
        System.out.println("Printing the square pattern below : ");
        for(int i = 1 ; i <=4 ; i++){
            System.out.println("* * * *");
        }
    }
}