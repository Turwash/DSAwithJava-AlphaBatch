package TypeConversionTypeCastingAndTypePromotion;

public class TypeCasting {
    public static void main(String[] args) {
    float a = 2547.23f; //convert from double to float
    int b = (int) a; //convert from float to int
    System.out.println("Value casted to Int is now : "+b);


    //IMPPPP THIS TYPE CASTING IS POSSIBLE IN JAVA

    char c = 'a';
    char d = 'b';
    int n = c ;
    int n2 = d;
    System.out.println("Value of char A is : "+n);  // Gives value 97 , a=97 , b=98 , c=99 and so on.. 
    System.out.println("Value of char B is : "+n2);
    }
    
   
}


// Note : 

//Type casing is also called Narrowing Conversion 

// Type casting is that conversion which is done by forcing and facing the data loss
/*For example when we want to convert from float to int java compiler will 
not let us do but by the help of type casting we do this and even after data loss
we change the data type */

