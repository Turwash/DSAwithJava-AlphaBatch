package LoopsConcept.NestedLoop;


public class StarPattern {
    public static void main(String[] args) {

        //outer loop for Number of line
        for (int line = 1 ; line <=4 ; line++){

            //inner loop for one line
            for(int star =1; star<=line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
