package funcionalnterface.supplier;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample1_2 {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}

class SupplierExample1_3 {
    public static void main(String[] args) {
        List<String> listaSaudacoes = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem-vindo(a)!";
            }
        }).limit(5).toList();

        listaSaudacoes.forEach(n -> System.out.println(n));
    }
}

class SupplierExemplo1_4{
    public static void main(String[] args) {
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!").limit(5).toList();
        listaSaudacoes.forEach(System.out::println);
    }
}