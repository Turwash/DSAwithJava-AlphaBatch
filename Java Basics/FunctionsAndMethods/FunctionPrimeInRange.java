package FunctionsAndMethods;

public class FunctionPrimeInRange {

//Prime Function 
    public static Boolean isPrime(int a) {

        //for 2
        if(a ==2){
            return true;
        }
        
        for(int i = 2; i<=Math.sqrt(a) ; i++){ //optimised for root a 
            if(a%i==0){
                return false;
            }
        }
        return true;
       
    }

    //Prime in range Function

    public static void primeInRange(int n) {

        for(int i = 2 ; i <= n ; i++ ){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        
    }
  
// Main Function calling prime in range
    public static void main(String[] args) {
    
        primeInRange(20);
        
    }
}
