package exercise_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float number = getFloatingPointNumber();
        System.out.println("Вы ввели число: " + number);
    }
    
    public static float getFloatingPointNumber() {
    

    try (Scanner scanner = new Scanner(System.in)) {
        float number = 0f;
boolean validInput = false;

        while(!validInput)
        {
            System.out.println("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Ошибка! Введите дробное число: ");
                scanner.next();
            }
        }
        return number;
    }
}


}