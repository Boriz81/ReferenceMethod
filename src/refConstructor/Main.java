package refConstructor;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // ClassName :: new
        Function<String, Person> personGenerator = Person :: new;
        Person johnFoster = personGenerator.apply("John Foster");

        // lambda
        Function<String, Person> personGeneratorLambda = name -> new Person(name);
    }
}
