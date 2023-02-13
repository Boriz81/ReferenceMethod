package refToInstanceMethodType;

import java.util.Date;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


        Function<Long, Double> converter = Long :: doubleValue;
        System.out.println(converter.apply(100L));
        // лямбда выражение
        Function<Long, Double> converterLambda = val -> val.doubleValue();
    }
}
