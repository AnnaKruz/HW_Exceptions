package FinalExamination;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class UserInfoAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите данные через пробел в формате: Фамилия Имя Отчество Дата_рождения(dd.mm.yyyy) Номер_телефона(только числа) пол: ");
        String input = scanner.nextLine();

        try {
            String[] data = input.split(" ");
            if (data.length != 6) {
                throw new IllegalArgumentException("Вы ввели не все данные");
            }

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            Date dateOfBirth = parseData(data[3]);
            int phoneNumber = Integer.parseInt(data[4]);
            char gender = data[5].charAt(0);

            //вывод данных

            System.out.println("Фамилия: " + lastName);
            System.out.println("Имя: " + firstName);
            System.out.println("Отчество: " + middleName);
            System.out.println("Дата рождения: " + formatData(dateOfBirth));
            System.out.println("Номер телефона: " + phoneNumber);
            System.out.println("Пол: " + gender);

            String fileName = lastName + ".txt";
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write("<" + lastName + "><" + fileName + "><" + middleName + "><" + dateOfBirth + "><"
                    + phoneNumber + "><" + gender + ">");
            fileWriter.close();


        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты");
            
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверны формат телефона");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: недостаточно данных");

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static Date parseData(String dateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return (Date) format.parse(dateStr);
    }

    private static String formatData(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return format.format(date);
    }

    
}