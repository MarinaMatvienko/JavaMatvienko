public class Array {
    public static void main(String[] args) {
        // Задали массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Четные числа из массива:");
        // Перебор элементов массива
        for (int number : numbers) {
            // Проверяю на четность числа
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
