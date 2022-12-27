package VariablesDataTypes;

public class DataTypes {
    public static void main(String[] args) {
        Byte a = 127;
        System.out.println(a);
        Short b = 32767;
        System.out.println(b);
        char c = 'c';
        System.out.println(c);
        Boolean d = true;
        System.out.println(d);
        float e = 23.66f; // f is used to make value float else it takes it as double by itself
        System.out.println(e);
        int f = 13243;
        System.out.println(f);
        long g = 1214235434;
        System.out.println(g);
        Double h = 24235.32523;
        System.out.println(h);
    } 
}


// Notes: 

/* DATA TYPES IN JAVA
 * 1) Primitive : byte, short, char, boolean, int, long, float, double.
 * 2) Non Primitive : String, Array, Class, Objects, Interface
 
 * Primitive exists in Java already , We define Non Primitive
 * Java is a Typed Language you have to write the name of variable before declaring variable
 
 * Byte Data type has minimum value of -128 and a maximum value of 127 (i.e 256 numbers) (1 byte - 8 bits)
 * Short Data type has minimum value of -32,768 and a maximum value of 32,767 (2 byte - 16 bits)
 * Char Takes only one character alphabet or symbol (2 byte- 16 bits)
 * Boolean Takes only "True" and "False" - Condition checks (1 byte - 8 bits)
 * Float - decimal Value (4 bytes - 32 bits)
 * Int- Integer , whole value (4 bytes - 32 bits)
 * Long - Big size number (8 bytes - 64 bits)
 * Double - Big size number in decimal (8 bytes- 64 bits)
 */