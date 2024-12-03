import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double averageOfEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println("Average of even numbers: " + averageOfEvenNumbers);
    }
}
