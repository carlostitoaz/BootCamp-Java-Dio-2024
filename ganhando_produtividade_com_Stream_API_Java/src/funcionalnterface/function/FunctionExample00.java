package funcionalnterface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample00{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

        List<Double> numerosDobro = numeros.stream().map(new Function<Integer, Double>() {
            @Override
            public Double apply(Integer n) {
                return n*2D;
            }
        }).toList();

        numerosDobro.forEach(System.out::println);
    }
}


class FunctionExample01{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

        Function<Integer, Double> myFunction = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer n) {
                return n*2D;
            }
        };

        List<Double> numerosDobro = numeros.stream().map(myFunction).collect(Collectors.toList());

        numerosDobro.forEach(n -> System.out.println(n));
    }
}

class FunctionExample03{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

        Function<Integer, Integer> myFunction = (Integer n) -> n*2;

        List<Integer> numerosDobro = numeros.stream().map(myFunction).toList();

        numerosDobro.forEach(System.out::println);
    }
}

class FunctionExample04{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> numerosDobro = numeros.stream().map(n -> n*2).toList();

        numerosDobro.forEach(System.out::println);
    }
}