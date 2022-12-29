package LoopsConcept.NestedLoop;

public class CharacterPattern {
    public static void main(String[] args) {
        int n =4;
        char ch = 'A';
        for(int line=1 ; line<=n ; line++){
            for(char alpha = 1 ; alpha<=line ; alpha++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
