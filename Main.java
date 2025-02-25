import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = new ArrayList<>();

        // Отфильтруйте положительные числа
        for (int num : intList) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        List<Integer> evenNumbers = new ArrayList<>();

        // Найдите среди этих положительных чисел четные
        for (int num : positiveNumbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        // Отсортируйте отфильтрованные числа в порядке возрастания
        Collections.sort(evenNumbers);

        // Выведите результат на экран
        for (int num : evenNumbers) {
            System.out.println(num);
        }
    }
}