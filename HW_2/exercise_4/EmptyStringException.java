package exercise_4;

import java.util.Scanner;

public class EmptyStringException {

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Введите строку: ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new Exception("Вы ничего не ввели");
                }

                System.out.println("Вы ввели: " + input);

            } catch (Exception e) {
                System.out.println(e.getMessage());

            } finally {
                scanner.close();
            }

        }
    }
        

    
