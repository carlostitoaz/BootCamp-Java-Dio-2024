package lambda.semParametro;

public class ExpressaoLambda {
    public static void main(String[] args) {
        String nome = "Ana Maria";

        //Teste de Lambda sem parametro
        MinhaInterfaceFuncional myfunc;

        myfunc = () -> System.out.println("Expressão Lambda sem parêmetros"); // (aqui fica o que seria passado como parametro) -> (aqui eu impremento o metodo da interface)
        myfunc.metodoSemParametro();

        myfunc = () -> System.out.println(nome); // (aqui fica o que seria passado como parametro) -> (aqui eu impremento o metodo da interface)
        myfunc.metodoSemParametro();
    }
}
