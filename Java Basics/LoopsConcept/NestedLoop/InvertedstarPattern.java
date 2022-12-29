package LoopsConcept.NestedLoop;

public class InvertedstarPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int line = 1 ; line<=n ; line++){
           // for(int star = 4 ; star >= line ; star--){  this code also works but best alternative is the below line code.
            for(int star = 1; star <= (n-line+1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
