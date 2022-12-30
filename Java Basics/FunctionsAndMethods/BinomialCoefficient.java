package FunctionsAndMethods;
import java.util.*;


public class BinomialCoefficient {
// nCr = n! / r! (n-r)!


public static int Fact(int a){
    int Fact = 1;
    for( int i = 1; i <= a ;i++){
        Fact = Fact * i;
    }
    return Fact;
}

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First Number : ");
            int n = sc.nextInt();
            System.out.print("Enter First Number : ");
            int r = sc.nextInt();
            int Ans =  (int)(Fact(n)/ (Fact(r) * (Fact(n-r))));

            System.out.println("Ans is : "+Ans);
    }
}
}
