package exercise_2;

public class Main {
    try {
        int d = 2;
        int[] intArray;
        double catchedRes1 = intArray[7] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     }
     
}
