import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        // ссылка на стандартный статичный метод max оберточного класса Integer
        BiFunction<Integer, Integer, Integer> max = Integer :: max;
        IntBinaryOperator max2 = Integer :: max;
        System.out.println(max.apply(5, 6));

        // такая же лямда выражение
        BiFunction<Integer, Integer, Integer> maxLambda = (x, y) -> Integer.max(x, y);

        // Виды ссылки на метод:
        /*
        1. ссылка на статичный метод
        2. ссылка на экземпляр метода уже существующего объекта
        3. ссылка
         */

    }
}