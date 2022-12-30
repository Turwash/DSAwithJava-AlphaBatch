package FunctionsAndMethods;




public class CallByValueSwap {



    public static void swap(int a , int b) {
          // swap code
          int temp = a;
          a = b ;
          b = temp;
  
          System.out.println("a value is now = "+a);
          System.out.println("b value is now = "+b);
          System.out.println("Temporary temp stores: "+temp);

    }
    public static void main(String[] args) {
        //swap - values exchange
        int a = 5;
        System.out.println("Initial Value of a : "+a);
        int b = 6;
        System.out.println("Initial Value of b : "+b);
        swap(a ,b);
      
    }
}
