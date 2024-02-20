import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции со значениями
        int sum = a + b;
        System.out.println("Сумма: " + sum);

        int difference = a - b;
        System.out.println("Разность: " + difference);

        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Частное: " + division);
        } else {
            System.out.println("На ноль делить нельзя.");
        }

        int product = a * b;
        System.out.println("Произведение: " + product);

        scanner.close();
    }
}
