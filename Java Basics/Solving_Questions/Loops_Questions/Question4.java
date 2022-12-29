package Solving_Questions.Loops_Questions;
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Enter Number to get Table : ");
            int num = sc.nextInt();
            int ten = 10;
            
            for(int i = 1 ; i <= ten ; i++){
                int fina = num * i;
                System.out.println(num+ " multiply " +i+ " is equal to :" +fina);
            }
        }
    }
}
