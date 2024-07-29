package funcionalnterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1_2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) { //Definindo como o método vai ser implementado
                System.out.println(numero);
            }
        };

        //Maneira 1 para imprimir
        for (var n : numeros){
            imprimirNumeroPar.accept(n);
        }

        //Maneira 2 para imprimir
        numeros.stream().forEach(imprimirNumeroPar);

        //Maneira 3 para imprimir
        numeros.forEach(imprimirNumeroPar);
    }
}

class ConsumerExample1_3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numeros.stream()
            .forEach(new Consumer<Integer>() {
                @Override
                public void accept(Integer n) {
                    if(n % 2 == 0){
                        System.out.println(n);
                    }
                }
            });

    }
}

class ConsumerExample1_4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numeros.stream()
            .forEach(n -> {
                if(n % 2 == 0){
                    System.out.println(n);
                }
            });
    }
}

class ConsumerExample1_5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}