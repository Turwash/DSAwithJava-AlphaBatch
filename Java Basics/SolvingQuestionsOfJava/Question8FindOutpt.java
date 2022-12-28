package SolvingQuestionsOfJava;
// Find Output
public class Question8FindOutpt {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        System.out.println("value of x: "+x);
        System.out.println("value of y: "+y);
        System.out.println("value of z: "+z);
        y -= z;
        System.out.println("value of x: "+x);
        System.out.println("value of y: "+y);
        System.out.println("value of z: "+z);
        z /= (x + y); // x+y is divides z 
        System.out.println("value of x: "+x);
        System.out.println("value of y: "+y);
        System.out.println("value of z: "+z);
        System.out.println(x + " " + y + " " + z);
    }
}
