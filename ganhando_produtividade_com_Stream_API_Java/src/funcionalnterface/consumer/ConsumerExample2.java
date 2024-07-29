package funcionalnterface.consumer;

import java.util.stream.Stream;

public class ConsumerExample2 {
    public static void main(String[] args) {
        String texto = "Minha consumer";

        //Exemplo1
        Iconsumer<String> myfunc = (tipoT) -> System.out.println(tipoT);
        //Iconsumer<String> myfunc = System.out::println;
        myfunc.absMetodo_accept(texto);

        //Exemplo2
        myfunc = (str) -> System.out.println(str.toUpperCase());
        myfunc.absMetodo_accept(texto);
    }
}

interface Iconsumer<T>{
    void absMetodo_accept(T tipoT);
}
