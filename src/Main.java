import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        getNumber();
        getString();
    }

    // 1. Метод запрашивает ввод дробного числа и возвращает введенное значение.
    // При вводе текста вместо числа ввод данных запрашивается повторно.
    public static void getNumber () {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean invalidInput = true;
        while (invalidInput) {
            System.out.print("Введите дробное число: ");
            try {
                number = scanner.nextFloat();
                invalidInput = false;
            } catch (Exception e) {
                System.out.println("Вы ввели неверный формат.");
                scanner.nextLine();
            }
        }
        System.out.println("Вы ввели: " + number);
    }

    // 2. Исправьте ошибку в коде
//    try {
//        int d = 0;
//        double catchedRes1 = 0:
//        if (d != 0){
//            catchedRes1 = intArray[8] / d;
//        }
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }

    // 3. Исправьте ошибку в коде
//    public static void main (String[] args) {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2, 3, 4 };
//            abc[3] = 9;
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }

    // 4. Программа выбрасывает Exception, когда пользователь вводит пустую строку.
    // Выводится сообщение, что пустые строки вводить нельзя.
    public static void getString () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String userStr = scanner.nextLine();
        if (userStr.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя.");
        } else {
            System.out.println("Вы ввели: " + userStr);
        }
    }

}
