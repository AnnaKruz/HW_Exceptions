package exercise_3;


public class Main {
    
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 1;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (ArithmeticException ex) {
       System.out.println("На ноль делить нельзя!");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}

public static void printSum(Integer a, Integer b) throws NullPointerException {
    if (a == null || b == null)
        throw new NullPointerException("Упс");
   System.out.println(a + b);
}


}
