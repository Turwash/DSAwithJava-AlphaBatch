package FunctionsAndMethods.MethodScopeBlockScope;



public class MethodAndBlockScope {

    public static void MethodScope() {
// we cant use b here as b is defined below
     //   System.out.println(b);
    int b = 45;
    System.out.println(b);
    }



    public static void main(String[] args) {
        int a = 45;
        System.out.println(a);

        // we cant use b here as int b is not defined in this function
        //MethodScope(b);
        //System.out.println(b);
    }
    // Below code will give error as it is out of the braces, Block Scope
    // System.out.println(a); 
    
}
