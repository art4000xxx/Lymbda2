import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        intList.stream()
                .filter(x -> x > 0)  // Отфильтруйте положительные числа
                .filter(x -> x % 2 == 0)  // Найдите среди этих положительных чисел четные
                .sorted()  // Отсортируйте отфильтрованные числа в порядке возрастания
                .forEach(System.out::println);  // Выведите результат на экран
    }
}