package refToInstanceMethodOfObject;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Основная форма - objectName :: instanceMethodName
        // Ссылка на метод экземпляра объекта

        String whatsGoingOnText = "What's going on here";
        Function<String, Integer> indexWithinString = whatsGoingOnText :: indexOf;
        System.out.println(indexWithinString.apply("going"));
        // лямбда
        Function<String, Integer> indexWithLambda = string -> whatsGoingOnText.indexOf(string);
    }
}
