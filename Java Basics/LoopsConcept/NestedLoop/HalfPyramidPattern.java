package LoopsConcept.NestedLoop;


public class HalfPyramidPattern {
    public static void main(String[] args) {

        //outer loop for Number of line
        for (int line = 1 ; line <=4 ; line++){

            //inner loop for one line
            for(int number =1; number<=line ; number++){
                System.out.print(number); // we will print number i.e number for count
            }
            System.out.println();
        }
    }

}
