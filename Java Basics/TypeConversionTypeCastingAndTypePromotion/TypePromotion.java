package TypeConversionTypeCastingAndTypePromotion;

public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        // char c = a-b; is not possible as a-b became int and int cant convert to char
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(a); // No type promotion here , it happens only with expressions
        System.out.println(b-a); // This is expression so char promoted to int


        //Function calling
        exampleforByteShortChar();
        exampleforLongFloatDouble();
    }

    static void exampleforByteShortChar() {
        short a = 12;
        byte b = 10;
        char c = 'a';
        // byte bt = a+b+c;
        byte bt = (byte) (a+b+c);

        /*
        Line 18 Not possible because a+b+c is now promoted to int and bt is byte , 
        int cant be converted to byte 
        but in Line 19 everything can be done by type casting but the value will be wrong
        but annything will be printed with type casting
        */
    
        System.out.println(bt);
    }

    static void exampleforLongFloatDouble(){
        int a= 10;
        float b= 23.2f;
        long c = 132;
        double d = 213;
        double ans = a+b+c+d;
        System.out.println(ans); 
       // All values converted to double as double is the largest data structure here
   
    }
    static void example(){
        byte a = 5;
        byte b = (byte)(a * 2); 
        /* This is error as logically it should give 10ans 
        but after expression it has been promoted and b became int 
        now int value cant be stored in byte data structure 
        so, we did type casting for byte to get ans 10. we have to focus everytime 
        whenever we are using Expressions */
        System.out.println(b);

    }
}


// Notes :

/* Type Promotion In Expression: 
 * Java automatically promotes each byte, short and char operand to Int when 
 evaluating an expression. 
 * If one operand is long , float or double the whole expression is promoted to 
 long, float or double respectively. 
 */