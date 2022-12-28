package OperatorsInJava;
// Arithmetic -> Unary Operators (Needs Single Operands to perform its functions)
public class ArithmeticUnaryOperators {
    public static void main(String[] args) {
        //Post Increment 
        int a = 10;
        int b = a++ ;
        System.out.println(a);
        System.out.println(b);
        //Pre Increment
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        //Post Decrement 
        int e = 10;
        int f = e--;
        System.out.println(e);
        System.out.println(f);
        //Pre Decrement
        int g = 10;
        int h = --g;
        System.out.println(g);
        System.out.println(h);
        
    }
}


// Notes : 

/*
  a = a + 1 is a++ or ++a
  a = a - 1 is a-- or --a 

  a++ -> Increment Operator
  a-- -> Decrement Operator

  Increment Operator :- 
  1) Pre Increment (++a) -> Value change and then value use
  2) Post Increment (a++) -> Value use and then value change

  Decrement Operator
  1) Pre Decrement (--a) -> Value change and then value use
  2) Post Decrement (a--) -> Value use and then value change
  

 */